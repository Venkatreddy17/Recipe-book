package com.example.RecipeBook.service;

import java.util.List;
import java.util.Optional;

import com.example.RecipeBook.entity.Review;

public interface ReviewService {
    List<Review> getAllReviews();
    Optional<Review> getReviewById(Long id);
    Review addReview(Review review);
    Optional<Review> updateReview(Long id, Review updatedReview);
    void deleteReview(Long id);
}


