package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class RecipeService {
    private List<Recipe> recipes;

    public RecipeService(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public List<Recipe> searchByIngredient(String ingredient) {
        return recipes.stream()
                .filter(recipe -> recipe.getIngredients().contains(ingredient))
                .collect(Collectors.toList());
    }

    public List<Recipe> searchByDiet(String diet) {
        return recipes.stream()
                .filter(recipe -> recipe.getDiet().equalsIgnoreCase(diet))
                .collect(Collectors.toList());
    }

    public List<Recipe> excludeIngredients(List<String> excludedIngredients) {
        return recipes.stream()
                .filter(recipe -> excludedIngredients.stream().noneMatch(recipe.getIngredients()::contains))
                .collect(Collectors.toList());
    }
}
