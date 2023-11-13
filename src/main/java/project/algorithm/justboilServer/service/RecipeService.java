package project.algorithm.justboilServer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.algorithm.justboilServer.common.exception.BusinessException;
import project.algorithm.justboilServer.common.exception.ErrorType;
import project.algorithm.justboilServer.model.Recipe;
import project.algorithm.justboilServer.model.dto.RecipeResponse;
import project.algorithm.justboilServer.model.dto.ThreeRecipeResponse;
import project.algorithm.justboilServer.repository.RecipeJpaRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static project.algorithm.justboilServer.common.exception.ErrorType.EMPTY_RECIPE_LIST_ERROR;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RecipeService {

    private final RecipeJpaRepository recipeJpaRepository;
    private final YouTubeService youTubeService;

    @Transactional
    public ThreeRecipeResponse getRecipeList(List<String> creatorIdList, String selectedFoodName, Integer startIndex) {

        List<Recipe> recipeList = new ArrayList<>();
        for (String curCreatorId : creatorIdList) {
            List<Recipe> curRecipeList = recipeJpaRepository.findByCreatorId(curCreatorId);
            if (curRecipeList == null || curRecipeList.isEmpty()) {
                curRecipeList = youTubeService.getChannelVideos(curCreatorId);
                System.out.println(curRecipeList.size());
                recipeJpaRepository.saveAll(curRecipeList);
            }
            if (curRecipeList == null || curRecipeList.isEmpty()) {
                throw new BusinessException(EMPTY_RECIPE_LIST_ERROR);
            }
            recipeList.addAll(curRecipeList);
        }

        List<Recipe> filteredRecipeList = recipeList.stream()
                .filter(recipe -> recipe.getTitle().contains(selectedFoodName))
                .toList();

        // Decrease and Counquer 2 - Selection Problem 적용
        Recipe[] recipesArray = filteredRecipeList.toArray(new Recipe[0]);

        Recipe recipeAtStartIndex = quickselect(recipesArray, 0, recipesArray.length - 1, startIndex);
        Recipe recipeAtStartIndexPlusOne = quickselect(recipesArray, 0, recipesArray.length - 1, startIndex + 1);
        Recipe recipeAtStartIndexPlusTwo = quickselect(recipesArray, 0, recipesArray.length - 1, startIndex + 2);

        List<RecipeResponse> topRecipes = new ArrayList<>();
        topRecipes.add(RecipeResponse.of(recipeAtStartIndex));
        topRecipes.add(RecipeResponse.of(recipeAtStartIndexPlusOne));
        topRecipes.add(RecipeResponse.of(recipeAtStartIndexPlusTwo));


        return ThreeRecipeResponse.of(topRecipes, selectedFoodName);
    }

    private int partition(Recipe[] arr, int low, int high) {
        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low) + low;
        Recipe pivot = arr[pivotIndex];
        swap(arr, pivotIndex, high);

        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j].getViewCount().compareTo(pivot.getViewCount()) > 0) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, high);
        return i;
    }

    private Recipe quickselect(Recipe[] arr, int low, int high, int k) {
        if (low == high) {
            return arr[low];
        }

        int pivotIndex = partition(arr, low, high);

        if (k == pivotIndex) {
            return arr[k];
        } else if (k < pivotIndex) {
            return quickselect(arr, low, pivotIndex - 1, k);
        } else {
            return quickselect(arr, pivotIndex + 1, high, k);
        }
    }

    private void swap(Recipe[] arr, int i, int j) {
        Recipe temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
