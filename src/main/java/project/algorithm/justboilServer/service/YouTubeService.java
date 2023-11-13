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
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import project.algorithm.justboilServer.common.exception.BusinessException;
import project.algorithm.justboilServer.common.exception.ErrorType;
import project.algorithm.justboilServer.model.Recipe;

import java.io.IOException;
import java.util.*;

import static project.algorithm.justboilServer.common.exception.ErrorType.*;

@Slf4j
@Service
public class YouTubeService {

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new JacksonFactory();

    private static YouTube youtube;

    @Value("${youtube.key}")
    private String PRIVATE_KEY;

    private static final long NUMBER_OF_VIDEOS_RETURNED = 50;

    public List<Recipe> getChannelVideos(String channelId) {
        try {
            youtube = new YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY, new HttpRequestInitializer() {
                public void initialize(HttpRequest request) throws IOException {
                }
            }).setApplicationName("youtube-search-by-channelId").build();

            Set<String> playlistIdSet = getPlaylistSet(channelId);
            Set<String> videoIdSet = getVideoIdList(playlistIdSet);

            List<Video> videos = getVideos(videoIdSet);

            return videos.stream()
                    .map(video -> Recipe.of(channelId, video.getSnippet().getTitle(),
                            video.getSnippet().getThumbnails().getDefault().getUrl(),
                            video.getId(), video.getStatistics().getViewCount()))
                    .toList();

        } catch (Exception e) {
            throw new BusinessException(EMPTY_RECIPE_LIST_ERROR);
        }
    }

    private Set<String> getPlaylistSet(String channelId) throws IOException {
        Set<String> playlistSet = new HashSet<>();
        YouTube.Channels.List channel = youtube.channels().list("contentDetails");
        channel.setKey(PRIVATE_KEY);
        channel.setMaxResults(NUMBER_OF_VIDEOS_RETURNED);
        channel.setId(channelId);

        String nextPageToken = null;
        do {
            channel.setPageToken(nextPageToken);
            ChannelListResponse response = channel.execute();
            for (Channel channelItem : response.getItems()) {
                String uploads = channelItem.getContentDetails().getRelatedPlaylists().getUploads();
                playlistSet.add(uploads);
            }
            nextPageToken = response.getNextPageToken();
        } while (nextPageToken != null);

        log.info("탐색한 playList 수: " + playlistSet.size());
        return playlistSet;
    }

    private Set<String> getVideoIdList(Set<String> playlistIdSet) throws IOException {
        Set<String> videoIdSet = new HashSet<>();

        for (String playlistId : playlistIdSet) {
            YouTube.PlaylistItems.List playList = youtube.playlistItems().list("snippet, contentDetails");
            playList.setKey(PRIVATE_KEY);
            playList.setMaxResults(NUMBER_OF_VIDEOS_RETURNED);
            playList.setPlaylistId(playlistId);

            String nextPageToken = null;
            do {
                playList.setPageToken(nextPageToken);
                PlaylistItemListResponse playlistItemListResponse = playList.execute();
                for (PlaylistItem item : playlistItemListResponse.getItems()) {
                    videoIdSet.add(item.getContentDetails().getVideoId());
                }
                nextPageToken = playlistItemListResponse.getNextPageToken();
            } while (nextPageToken != null);
        }

        log.info("탐색한 PlaylistItem 수: " + videoIdSet.size());
        return videoIdSet;
    }

    private List<Video> getVideos(Set<String> videoIdSet) throws IOException {
        List<Video> videos = new ArrayList<>();
        List<String> videoIdList = new ArrayList<>(videoIdSet);

        // YouTube API의 한 번의 요청당 최대 비디오 ID 수는 50개입니다.
        int maxResultsPerRequest = (int) NUMBER_OF_VIDEOS_RETURNED;
        for (int i = 0; i < videoIdList.size(); i += maxResultsPerRequest) {
            int end = Math.min(i + maxResultsPerRequest, videoIdList.size());
            YouTube.Videos.List video = youtube.videos().list("snippet, contentDetails, statistics");
            video.setKey(PRIVATE_KEY);
            video.setId(String.join(",", videoIdList.subList(i, end)));
            VideoListResponse videoListResponse = video.execute();
            videos.addAll(videoListResponse.getItems());
        }

        log.info("탐색한 video 수: " + videos.size());
        return videos;
    }

}
