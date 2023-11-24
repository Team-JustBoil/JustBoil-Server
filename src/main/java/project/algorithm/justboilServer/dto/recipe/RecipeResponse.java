package project.algorithm.justboilServer.dto.recipe;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import project.algorithm.justboilServer.model.Recipe;

import java.math.BigInteger;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record RecipeResponse(
       Long id,
       String title,
       String thumbnail,
       String youtubeId,
       BigInteger viewCount,
       String summary
) {
    public static RecipeResponse of(Recipe recipe) {

        if (recipe == null) {
            return null;
        }
        return new RecipeResponse(
                recipe.getId(),
                recipe.getTitle(),
                recipe.getThumbnail(),
                recipe.getYoutubeId(),
                recipe.getViewCount(),
                recipe.getSummary()
        );
    }
}
