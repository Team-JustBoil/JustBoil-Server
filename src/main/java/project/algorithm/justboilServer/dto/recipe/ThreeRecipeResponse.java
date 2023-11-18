package project.algorithm.justboilServer.dto.recipe;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonPropertyOrder({"foodName", "recipeResponseList"})
public record ThreeRecipeResponse(
        String foodName,
        List<RecipeResponse> recipeResponseList
) {
    public static ThreeRecipeResponse of(String foodName, List<RecipeResponse> recipeResponseList) {
        return new ThreeRecipeResponse(
                foodName,
                recipeResponseList
        );
    }
}
