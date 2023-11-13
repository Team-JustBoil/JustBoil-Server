package project.algorithm.justboilServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.algorithm.justboilServer.model.Recipe;

import java.util.List;

public interface RecipeJpaRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByCreatorId(String creatorId);
}