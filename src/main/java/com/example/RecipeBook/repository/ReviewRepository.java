package com.example.RecipeBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RecipeBook.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
