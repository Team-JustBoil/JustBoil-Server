package project.algorithm.justboilServer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String creatorId;

    private String title;

    private String thumbnail;

    private String youtubeId;

    private BigInteger viewCount;

    private String summary;

    @Builder
    public Recipe(String creatorId, String title, String thumbnail, String youtubeId, BigInteger viewCount) {
        this.creatorId = creatorId;
        this.title = title;
        this.thumbnail = thumbnail;
        this.youtubeId = youtubeId;
        this.viewCount = viewCount;
    }

    public static Recipe of(String creatorId, String title, String thumbnail, String youtubeId, BigInteger viewCount) {
        return Recipe.builder()
                .creatorId(creatorId)
                .title(title)
                .thumbnail(thumbnail)
                .youtubeId(youtubeId)
                .viewCount(viewCount)
                .build();
    }
}
