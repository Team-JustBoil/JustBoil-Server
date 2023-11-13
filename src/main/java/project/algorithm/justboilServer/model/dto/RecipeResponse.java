package project.algorithm.justboilServer.model.dto;

import project.algorithm.justboilServer.model.Recipe;

public record RecipeResponse(
       Long id,
       String title,
       String thumbnail,
       String youtubeId
) {
    public static RecipeResponse of(Recipe recipe) {
        return new RecipeResponse(
                recipe.getId(),
                recipe.getTitle(),
                recipe.getThumbnail(),
                recipe.getYoutubeId()
        );
    }
}
