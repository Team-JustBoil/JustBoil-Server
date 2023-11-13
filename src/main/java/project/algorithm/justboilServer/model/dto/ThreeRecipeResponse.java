package project.algorithm.justboilServer.model.dto;

import java.util.List;

public record ThreeRecipeResponse(
        List<RecipeResponse> recipeResponseList,
        String foodName
) {
    public static ThreeRecipeResponse of(List<RecipeResponse> recipeResponseList, String foodName) {
        return new ThreeRecipeResponse(
                recipeResponseList,
                foodName
        );
    }
}
