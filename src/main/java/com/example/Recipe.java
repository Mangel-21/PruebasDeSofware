package com.example;

import java.util.List;

public class Recipe {
    private String name;
    private List<String> ingredients;
    private String diet;

    public Recipe(String name, List<String> ingredients, String diet) {
        this.name = name;
        this.ingredients = ingredients;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getDiet() {
        return diet;
    }
}
