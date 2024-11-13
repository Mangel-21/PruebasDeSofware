package com.example;

import java.util.HashSet;
import java.util.Set;

public class FavoritesService {
    private Set<Recipe> favorites = new HashSet<>();

    public void addFavorite(Recipe recipe) {
        favorites.add(recipe);
    }

    public void removeFavorite(Recipe recipe) {
        favorites.remove(recipe);
    }

    public Set<Recipe> getFavorites() {
        return favorites;
    }
}
