package project.algorithm.justboilServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import project.algorithm.justboilServer.common.ApiResponse;
import project.algorithm.justboilServer.model.dto.RecipeResponse;
import project.algorithm.justboilServer.service.RecipeService;

import java.util.List;

import static project.algorithm.justboilServer.common.exception.SuccessType.PROCESS_SUCCESS;
import static project.algorithm.justboilServer.model.CreatorType.findCreatorIdListByTypeNumber;

@RestController
public class RecipeController {

    RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/{typeNumber}/random")
    public ApiResponse<List<RecipeResponse>> getPopularVideos(@PathVariable Integer typeNumber) {
        List<String> creatorIdList = findCreatorIdListByTypeNumber(typeNumber);
        return ApiResponse.success(PROCESS_SUCCESS, recipeService.getRecipeListRandom(creatorIdList));
    }
}