package com.example.RecipeBook.service;

import java.util.List;
import java.util.Optional;

import com.example.RecipeBook.entity.Ingredient;

public interface IngredientService {
    List<Ingredient> getAllIngredients();
    Optional<Ingredient> getIngredientById(Long id);
    Ingredient addIngredient(Ingredient ingredient);
    Optional<Ingredient> updateIngredient(Long id, Ingredient updatedIngredient);
    void deleteIngredient(Long id);
}



