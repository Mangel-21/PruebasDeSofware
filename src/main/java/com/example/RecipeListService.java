package com.example;

import java.util.ArrayList;
import java.util.List;

public class RecipeListService {
    private List<Recipe> recipes = new ArrayList<>();

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}
