package com.example.RecipeBook.service;

import java.util.List;
import java.util.Optional;

import com.example.RecipeBook.entity.Cuisine;

public interface CuisineService {
    List<Cuisine> getAllCuisines();
    Optional<Cuisine> getCuisineById(Long id);
    Cuisine addCuisine(Cuisine cuisine);
    Optional<Cuisine> updateCuisine(Long id, Cuisine updatedCuisine);
    void deleteCuisine(Long id);
}



