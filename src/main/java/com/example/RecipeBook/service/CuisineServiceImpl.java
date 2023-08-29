package com.example.RecipeBook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RecipeBook.entity.Cuisine;
import com.example.RecipeBook.repository.CuisineRepository;
import com.example.RecipeBook.repository.RecipeRepository;

@Service
public class CuisineServiceImpl implements CuisineService {
	
	@Autowired
    private CuisineRepository cuisineRepository;

	@Override
	public List<Cuisine> getAllCuisines() {
		// TODO Auto-generated method stub
		return cuisineRepository.findAll();
	}

	@Override
	public Optional<Cuisine> getCuisineById(Long id) {
		// TODO Auto-generated method stub
		return cuisineRepository.findById(id);
	}

	@Override
	public Cuisine addCuisine(Cuisine cuisine) {
		// TODO Auto-generated method stub
		return cuisineRepository.save(cuisine);
	}

	@Override
	public Optional<Cuisine> updateCuisine(Long id, Cuisine updatedCuisine) {
		// TODO Auto-generated method stub
		Optional<Cuisine> existingCuisine = cuisineRepository.findById(id);
        if (existingCuisine.isPresent()) {
            Cuisine cuisine = existingCuisine.get();
            cuisine.setName(updatedCuisine.getName());
            // Update other fields if needed
            return Optional.of(cuisineRepository.save(cuisine));
        } else {
            return Optional.empty();
        }
	}

	@Override
	public void deleteCuisine(Long id) {
		// TODO Auto-generated method stub
		cuisineRepository.deleteById(id);

	}

}
