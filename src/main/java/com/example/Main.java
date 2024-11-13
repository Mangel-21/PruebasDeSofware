package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear recetas peruanas
        Recipe ceviche = new Recipe("Ceviche", Arrays.asList("Fish", "Lemon", "Onion", "Chili"), "Pescatarian");
        Recipe lomoSaltado = new Recipe("Lomo Saltado", Arrays.asList("Beef", "Onion", "Tomato", "Potato"), "Non-Vegetarian");
        Recipe ajiDeGallina = new Recipe("Ají de Gallina", Arrays.asList("Chicken", "Yellow Pepper", "Bread"), "Non-Vegetarian");
        Recipe papaHuancaina = new Recipe("Papa a la Huancaína", Arrays.asList("Potato", "Cheese", "Yellow Pepper"), "Vegetarian");
        Recipe anticuchos = new Recipe("Anticuchos", Arrays.asList("Beef Heart", "Chili", "Potato"), "Non-Vegetarian");
        Recipe arrozConPollo = new Recipe("Arroz con Pollo", Arrays.asList("Chicken", "Rice", "Peas", "Carrot"), "Non-Vegetarian");
        Recipe sopaDeQuinua = new Recipe("Sopa de Quinua", Arrays.asList("Quinoa", "Carrot", "Peas", "Potato"), "Vegetarian");

        List<Recipe> recipes = Arrays.asList(ceviche, lomoSaltado, ajiDeGallina, papaHuancaina, anticuchos, arrozConPollo, sopaDeQuinua);
        RecipeService recipeService = new RecipeService(recipes);

        // Filtrar por ingrediente
        System.out.println("Filtrado por Tomate:");
        recipeService.searchByIngredient("Tomato").forEach(r -> System.out.println(r.getName()));

        System.out.println("\n");
        // Filtrar por dieta
        System.out.println("Filtrado por Dieta Vegetariana:");
        recipeService.searchByDiet("Vegetarian").forEach(r -> System.out.println(r.getName()));

        System.out.println("\n");
        // Excluir ingredientes
        System.out.println("Excluyendo recetas con Chicken:");
        recipeService.excludeIngredients(Arrays.asList("Chicken")).forEach(r -> System.out.println(r.getName()));
        System.out.println("\n");

        // Manejo de favoritos
        FavoritesService favoritesService = new FavoritesService();
        favoritesService.addFavorite(ceviche);
        System.out.println("Recetas favoritas:");
        favoritesService.getFavorites().forEach(r -> System.out.println(r.getName()));

        System.out.println("\n");
        // Manejo de listas de recetas
        RecipeListService recipeListService = new RecipeListService();
        recipeListService.addRecipe(ceviche);
        recipeListService.addRecipe(lomoSaltado);
        System.out.println("Lista de recetas:");
        recipeListService.getRecipes().forEach(r -> System.out.println(r.getName()));
        System.out.println("\n");

        // Simulación de registro e inicio de sesión
        AuthService authService = new AuthService();
        authService.register("user1", "pass1");
        System.out.println("Login exitoso: " + authService.login("user1", "pass1"));


        ApiService apiService = new ApiService();
        try {
            int responseCode = apiService.fetchData("http://example.com");
            System.out.println("Código de respuesta de la API: " + responseCode);
        } catch (Exception e) {
            System.out.println("Error al llamar a la API: " + e.getMessage());
        }
    }
}
