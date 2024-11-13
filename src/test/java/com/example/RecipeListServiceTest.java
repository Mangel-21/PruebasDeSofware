package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeListServiceTest {

    @Test
    public void testAddAndRemoveRecipe() {
        Recipe recipe1 = new Recipe("Salad", Arrays.asList("Lettuce", "Tomato"), "Vegan");
        RecipeListService recipeListService = new RecipeListService();

        recipeListService.addRecipe(recipe1);
        List<Recipe> recipes = recipeListService.getRecipes();

        assertEquals(1, recipes.size());
        assertEquals("Salad", recipes.get(0).getName());

        recipeListService.removeRecipe(recipe1);
        assertEquals(0, recipes.size());
    }
}
