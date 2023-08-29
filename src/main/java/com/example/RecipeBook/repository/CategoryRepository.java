package com.example.RecipeBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RecipeBook.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
