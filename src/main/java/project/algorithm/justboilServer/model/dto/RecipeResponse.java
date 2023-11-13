package project.algorithm.justboilServer.model.dto;

import project.algorithm.justboilServer.model.Recipe;

import java.math.BigInteger;

public record RecipeResponse(
       Long id,
       String title,
       String thumbnail,
       String youtubeId,
       BigInteger viewCount
) {
    public static RecipeResponse of(Recipe recipe) {
        return new RecipeResponse(
                recipe.getId(),
                recipe.getTitle(),
                recipe.getThumbnail(),
                recipe.getYoutubeId(),
                recipe.getViewCount()
        );
    }
}
