package project.algorithm.justboilServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import project.algorithm.justboilServer.common.ApiResponse;
import project.algorithm.justboilServer.model.dto.ThreeRecipeResponse;
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

    @GetMapping("/{typeNumber}/random/{startIndex}")
    public ApiResponse<ThreeRecipeResponse> getPopularVideos(@PathVariable Integer typeNumber, @PathVariable Integer startIndex) {
        List<String> creatorIdList = findCreatorIdListByTypeNumber(typeNumber);
        int randomIndex = new Random().nextInt(recipeRandomList.size());
        String selectedFoodName = recipeRandomList.get(randomIndex);
        return ApiResponse.success(PROCESS_SUCCESS, recipeService.getRecipeList(creatorIdList, selectedFoodName, startIndex));
    }

    @GetMapping("/{typeNumber}/{foodName}/{startIndex}")
    public ApiResponse<ThreeRecipeResponse> getPopularVideos(@PathVariable Integer typeNumber, @PathVariable String foodName, @PathVariable Integer startIndex) {
        List<String> creatorIdList = findCreatorIdListByTypeNumber(typeNumber);
        return ApiResponse.success(PROCESS_SUCCESS, recipeService.getRecipeList(creatorIdList, foodName, startIndex));
    }
}