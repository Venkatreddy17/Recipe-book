package com.example.RecipeBook.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RecipeBook.entity.Recipe;
import com.example.RecipeBook.repository.RecipeRepository;
@Service
public class RecipeServiceImpl implements RecipeService {
	
	@Autowired
	private RecipeRepository recipeRepository;

	@Override
	public List<Recipe> getAllRecipes() {
		// TODO Auto-generated method stub
		return recipeRepository.findAll();
	}

	@Override
	public Optional<Recipe> getRecipeById(Long id) {
		// TODO Auto-generated method stub
		return recipeRepository.findById(id);
	}

	@Override
	public Recipe addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		 return recipeRepository.save(recipe);
	}

	@Override
	public Optional<Recipe> updateRecipe(Long id, Recipe updatedRecipe) {
		// TODO Auto-generated method stub
		 Optional<Recipe> existingRecipe = recipeRepository.findById(id);
	        if (existingRecipe.isPresent()) {
	            Recipe recipe = existingRecipe.get();
	            // Update recipe fields
	            return Optional.of(recipeRepository.save(recipe));
	        } else {
	            return Optional.empty();
	        }
	}

	@Override
	public void deleteRecipe(Long id) {
		// TODO Auto-generated method stub
		recipeRepository.deleteById(id);

	}

	@Override
	public Recipe saveRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
