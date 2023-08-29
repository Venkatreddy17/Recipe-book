package com.example.RecipeBook.service;

import java.util.List;
import java.util.Optional;

import com.example.RecipeBook.entity.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long id);
    Category addCategory(Category category);
    Optional<Category> updateCategory(Long id, Category updatedCategory);
    void deleteCategory(Long id);
}



