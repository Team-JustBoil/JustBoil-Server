package project.algorithm.justboilServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.algorithm.justboilServer.model.Recipe;

public interface RecipeJpaRepository extends JpaRepository<Recipe, Long> {
}
