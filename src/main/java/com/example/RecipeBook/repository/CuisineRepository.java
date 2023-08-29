package com.example.RecipeBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RecipeBook.entity.Cuisine;

public interface CuisineRepository extends JpaRepository<Cuisine, Long> {

}
