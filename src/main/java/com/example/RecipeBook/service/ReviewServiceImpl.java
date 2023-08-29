package com.example.RecipeBook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RecipeBook.entity.Review;
import com.example.RecipeBook.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

	 @Autowired
	    private ReviewRepository reviewRepository;
	 
	@Override
	public List<Review> getAllReviews() {
		// TODO Auto-generated method stub
		return reviewRepository.findAll();
	}

	@Override
	public Optional<Review> getReviewById(Long id) {
		// TODO Auto-generated method stub
		return reviewRepository.findById(id);
	}

	@Override
	public Review addReview(Review review) {
		// TODO Auto-generated method stub
		return reviewRepository.save(review);
	}

	@Override
	public Optional<Review> updateReview(Long id, Review updatedReview) {
		// TODO Auto-generated method stub
		Optional<Review> existingReview = reviewRepository.findById(id);
        if (existingReview.isPresent()) {
            Review review = existingReview.get();
            review.setComment(updatedReview.getComment());
            review.setRating(updatedReview.getRating());
            // Update other fields if needed
            return Optional.of(reviewRepository.save(review));
        } else {
            return Optional.empty();
        }
	}

	@Override
	public void deleteReview(Long id) {
		// TODO Auto-generated method stub
		 reviewRepository.deleteById(id);

	}

}
