package com.example.RecipeBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RecipeBook.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
