package com.example.RecipeBook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RecipeBook.entity.Ingredient;
import com.example.RecipeBook.repository.IngredientRepository;

@Service
public class IngredientServiceImpl implements IngredientService {
	
	@Autowired
    private IngredientRepository ingredientRepository;

	@Override
	public List<Ingredient> getAllIngredients() {
		// TODO Auto-generated method stub
		return ingredientRepository.findAll();
	}

	@Override
	public Optional<Ingredient> getIngredientById(Long id) {
		// TODO Auto-generated method stub
		 return ingredientRepository.findById(id);
	}

	@Override
	public Ingredient addIngredient(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return ingredientRepository.save(ingredient);
	}

	@Override
	public Optional<Ingredient> updateIngredient(Long id, Ingredient updatedIngredient) {
		// TODO Auto-generated method stub
		Optional<Ingredient> existingIngredient = ingredientRepository.findById(id);
        if (existingIngredient.isPresent()) {
            Ingredient ingredient = existingIngredient.get();
            ingredient.setName(updatedIngredient.getName());
            ingredient.setQuantity(updatedIngredient.getQuantity());
            ingredient.setMeasurementUnit(updatedIngredient.getMeasurementUnit());
            return Optional.of(ingredientRepository.save(ingredient));
        } else {
            return Optional.empty();
        }
	}

	@Override
	public void deleteIngredient(Long id) {
		// TODO Auto-generated method stub
		 ingredientRepository.deleteById(id);

	}

}
