package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeServiceTest {

    @Test
    public void testSearchByIngredient() {
        Recipe recipe1 = new Recipe("Salad", Arrays.asList("Lettuce", "Tomato"), "Vegan");
        Recipe recipe2 = new Recipe("Chicken Soup", Arrays.asList("Chicken", "Carrot"), "Non-Vegetarian");

        RecipeService recipeService = new RecipeService(Arrays.asList(recipe1, recipe2));
        
        List<Recipe> results = recipeService.searchByIngredient("Tomato");
        assertEquals(1, results.size());
        assertEquals("Salad", results.get(0).getName());
    }

    @Test
    public void testExcludeIngredients() {
        Recipe recipe1 = new Recipe("Salad", Arrays.asList("Lettuce", "Tomato"), "Vegan");
        Recipe recipe2 = new Recipe("Chicken Soup", Arrays.asList("Chicken", "Carrot"), "Non-Vegetarian");

        RecipeService recipeService = new RecipeService(Arrays.asList(recipe1, recipe2));
        
        List<Recipe> results = recipeService.excludeIngredients(Arrays.asList("Chicken"));
        assertEquals(1, results.size());
        assertEquals("Salad", results.get(0).getName());
    }
}
