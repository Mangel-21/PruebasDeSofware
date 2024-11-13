package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class FavoritesServiceTest {

    @Test
    public void testAddAndRemoveFavorite() {
        Recipe recipe1 = new Recipe("Salad", Arrays.asList("Lettuce", "Tomato"), "Vegan");
        FavoritesService favoritesService = new FavoritesService();

        favoritesService.addFavorite(recipe1);
        Set<Recipe> favorites = favoritesService.getFavorites();

        assertEquals(1, favorites.size());
        assertTrue(favorites.contains(recipe1));

        favoritesService.removeFavorite(recipe1);
        assertEquals(0, favorites.size());
    }
}
