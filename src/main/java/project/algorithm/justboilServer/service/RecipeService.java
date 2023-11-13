package project.algorithm.justboilServer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.algorithm.justboilServer.model.dto.RecipeResponse;
import project.algorithm.justboilServer.repository.RecipeJpaRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RecipeService {

    private final RecipeJpaRepository recipeJpaRepository;
    private final YouTubeService youTubeService;
    private static final List<String> recipeRandomList = Arrays.asList("제육볶음", "파스타", "장조림", "김치찌개");

    public List<RecipeResponse> getRecipeListRandom(List<String> creatorIdList) {
        int randomIndex = new Random().nextInt(recipeRandomList.size());
        String selectedFoodName = recipeRandomList.get(randomIndex);


    }
}
