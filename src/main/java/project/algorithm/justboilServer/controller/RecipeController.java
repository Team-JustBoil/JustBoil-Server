package project.algorithm.justboilServer.controller;

import org.springframework.web.bind.annotation.*;
import project.algorithm.justboilServer.common.ApiResponse;
import project.algorithm.justboilServer.dto.recipe.ThreeRecipeResponse;
import project.algorithm.justboilServer.service.RecipeService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static project.algorithm.justboilServer.common.exception.SuccessType.PROCESS_SUCCESS;
import static project.algorithm.justboilServer.model.CreatorType.findCreatorIdListByTypeNumber;

@RestController
public class RecipeController {

    RecipeService recipeService;

    private static final List<String> recipeRandomList = Arrays.asList("제육볶음", "파스타", "장조림", "김치찌개", "부대찌개", "라면");

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/random/{typeNumber}")
    public ApiResponse<ThreeRecipeResponse> getPopularVideos(@PathVariable Integer typeNumber) {
        List<String> creatorIdList = findCreatorIdListByTypeNumber(typeNumber);
        int randomIndex = new Random().nextInt(recipeRandomList.size());
        String selectedFoodName = recipeRandomList.get(randomIndex);
        return ApiResponse.success(PROCESS_SUCCESS, recipeService.getRecipeList(creatorIdList, selectedFoodName, 0));
    }

    @GetMapping("/search/{typeNumber}")
    public ApiResponse<ThreeRecipeResponse> getPopularVideos(@PathVariable Integer typeNumber, @RequestParam String keyword, @RequestParam Integer index) {
        List<String> creatorIdList = findCreatorIdListByTypeNumber(typeNumber);
        return ApiResponse.success(PROCESS_SUCCESS, recipeService.getRecipeList(creatorIdList, keyword, index));
    }

}