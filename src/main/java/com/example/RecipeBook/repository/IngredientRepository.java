package com.example.RecipeBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RecipeBook.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
