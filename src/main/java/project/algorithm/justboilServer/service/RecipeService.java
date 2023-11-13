package project.algorithm.justboilServer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.algorithm.justboilServer.common.exception.BusinessException;
import project.algorithm.justboilServer.common.exception.ErrorType;
import project.algorithm.justboilServer.model.Recipe;
import project.algorithm.justboilServer.model.dto.RecipeResponse;
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
    private static final List<String> recipeRandomList = Arrays.asList("제육볶음", "파스타", "장조림", "김치찌개");

    @Transactional
    public List<RecipeResponse> getRecipeListRandom(List<String> creatorIdList) {

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

        int randomIndex = new Random().nextInt(recipeRandomList.size());
        String selectedFoodName = recipeRandomList.get(randomIndex);

        List<RecipeResponse> filteredRecipeList = recipeList.stream()
                .filter(recipe -> recipe.getTitle().contains(selectedFoodName))
                .toList().stream()
                .map(RecipeResponse::of)
                .collect(Collectors.toList());

        return filteredRecipeList;
    }
}
