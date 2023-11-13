package project.algorithm.justboilServer.service;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import project.algorithm.justboilServer.common.exception.BusinessException;
import project.algorithm.justboilServer.model.Recipe;

import java.io.IOException;
import java.util.*;

import static project.algorithm.justboilServer.common.exception.ErrorType.EMPTY_PLAYLIST_LIST_ERROR;
import static project.algorithm.justboilServer.common.exception.ErrorType.EMPTY_VIDEOITEM_LIST_ERROR;

@Service
public class YouTubeService {

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new JacksonFactory();

    private static YouTube youtube;

    @Value("${youtube.private-key}")
    private static String PRIVATE_KEY;
    private static final long NUMBER_OF_VIDEOS_RETURNED = 100;

    public List<Recipe> getChannelVideos(String channelId) {
        try {
            youtube = new YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY, new HttpRequestInitializer() {
                public void initialize(HttpRequest request) throws IOException {
                }
            }).setApplicationName("youtube-search-by-channelId").build();

            String apiKey = PRIVATE_KEY;

            Set<String> playlistIdSet = getPlaylistSet(channelId, apiKey);
            Set<String> videoIdSet= getVideoIdList(playlistIdSet, apiKey);

            List<Video> videos = getVideos(videoIdSet, apiKey);

            List<Recipe> recipes = new ArrayList<>();
            for (Video video : videos) {

            }

        } catch (GoogleJsonResponseException e) {
            System.err.println("There was a service error: " + e.getDetails().getCode() + " : " + e.getDetails().getMessage());
        } catch (IOException e) {
            System.err.println("There was an IO error: " + e.getCause() + " : " + e.getMessage());
        } catch (Throwable t) {
            t.printStackTrace();
        }

        return null;
    }

    private Set<String> getPlaylistSet(String channelId, String apiKey) throws IOException {
        ChannelListResponse channelListResponse = null;
        YouTube.Channels.List channel = youtube.channels().list("contentDetails");

        channel.setKey(apiKey);
        channel.setMaxResults(NUMBER_OF_VIDEOS_RETURNED);
        channel.setId(channelId);

        channelListResponse = channel.execute();

        Iterator<Channel> iteratorChannelResults = channelListResponse.getItems().iterator();
        Set<String> playlistSet = new HashSet<>();

        while (iteratorChannelResults.hasNext()) {
            Channel curChannel = iteratorChannelResults.next();
            String uploads = curChannel.getContentDetails().getRelatedPlaylists().getUploads();
            playlistSet.add(uploads);
        }
        return playlistSet;
    }

    private Set<String> getVideoIdList(Set<String> playlistIdSet, String apiKey) throws IOException {

        Set<String> videoIdSet = new HashSet<>();

        Iterator<String> iterator = playlistIdSet.iterator();
        if (!iterator.hasNext()) {
            throw new BusinessException(EMPTY_PLAYLIST_LIST_ERROR);
        }

        while (iterator.hasNext()) {
            String curPlaylistId = iterator.next();

            PlaylistItemListResponse playlistItemListResponse = null;
            YouTube.PlaylistItems.List playList = youtube.playlistItems().list("snippet, contentDetails");

            playList.setKey(apiKey);
            playList.setMaxResults(NUMBER_OF_VIDEOS_RETURNED);
            playList.setPlaylistId(curPlaylistId);
            playlistItemListResponse = playList.execute();

            Iterator<PlaylistItem> itemsIterator = playlistItemListResponse.getItems().iterator();

            if (!itemsIterator.hasNext()) {
                throw new BusinessException(EMPTY_VIDEOITEM_LIST_ERROR);
            }
            while (itemsIterator.hasNext()) {
                PlaylistItem curVideo = itemsIterator.next();
                videoIdSet.add(curVideo.getContentDetails().getVideoId());
            }
        }

        return videoIdSet;
    }

    private List<Video> getVideos(Set<String> videoIdSet, String apiKey) throws IOException {
        VideoListResponse videoListResponse = null;
        YouTube.Videos.List video = youtube.videos().list("snippet, contentDetails, statistics");

        video.setKey(apiKey);
        video.setMaxResults(NUMBER_OF_VIDEOS_RETURNED);
        List<String> videoIdList = videoIdSet.stream().toList();
        video.setId(String.join(",", videoIdList));
        videoListResponse = video.execute();

        return videoListResponse.getItems();
    }
}
