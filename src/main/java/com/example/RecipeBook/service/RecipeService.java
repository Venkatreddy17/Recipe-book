package com.example.RecipeBook.service;

import java.util.List;
import java.util.Optional;

import com.example.RecipeBook.entity.Recipe;

public interface RecipeService {
	    List<Recipe> getAllRecipes();
	    Optional<Recipe> getRecipeById(Long id);
	    Recipe addRecipe(Recipe recipe);
	    Optional<Recipe> updateRecipe(Long id, Recipe updatedRecipe);
	    void deleteRecipe(Long id);
		 Recipe saveRecipe(Recipe recipe); 
			// TODO Auto-generated method stub
			
		
	}



