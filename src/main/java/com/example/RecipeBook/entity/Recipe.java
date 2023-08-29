package com.example.RecipeBook.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="recipe")
 public class Recipe {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long recipeid;
	    
	    private String title;
	    private String description;
	    private int preparationTime;
	    private int cookingTime;
	    private int servings;
	    private String instructions;
	    
	    @ManyToOne
	    @JoinColumn(name="id")
	    private User id;
	    
	    @ManyToMany
	    private List<Ingredient> ingredients;
	    
	    @ManyToMany
	    private List<Category> categories;
	    
	    @ManyToOne
	    private Cuisine cuisine;
	    
	    @OneToMany(mappedBy = "recipe",cascade= CascadeType.ALL)
	    private List<Review> reviews=new ArrayList<>();

		
		

		public Long getRecipeid() {
			return recipeid;
		}

		public void setRecipeid(Long recipeid) {
			this.recipeid = recipeid;
		}

		public User getId() {
			return id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getPreparationTime() {
			return preparationTime;
		}

		public void setPreparationTime(int preparationTime) {
			this.preparationTime = preparationTime;
		}

		public int getCookingTime() {
			return cookingTime;
		}

		public void setCookingTime(int cookingTime) {
			this.cookingTime = cookingTime;
		}

		public int getServings() {
			return servings;
		}

		public void setServings(int servings) {
			this.servings = servings;
		}

		public String getInstructions() {
			return instructions;
		}

		public void setInstructions(String instructions) {
			this.instructions = instructions;
		}

		

		
		

		public List<Ingredient> getIngredients() {
			return ingredients;
		}

		public void setIngredients(List<Ingredient> ingredients) {
			this.ingredients = ingredients;
		}

		public List<Category> getCategories() {
			return categories;
		}

		public void setCategories(List<Category> categories) {
			this.categories = categories;
		}

		public List<Review> getReviews() {
			return reviews;
		}

		public void setReviews(List<Review> reviews) {
			this.reviews = reviews;
		}

		public void setId(User id) {
			this.id = id;
		}

		public Cuisine getCuisine() {
			return cuisine;
		}

		public void setCuisine(Cuisine cuisine) {
			this.cuisine = cuisine;
		}

		

		@Override
		public String toString() {
			return "Recipe [id=" + id + ", title=" + title + ", description=" + description + ", preparationTime="
					+ preparationTime + ", cookingTime=" + cookingTime + ", servings=" + servings + ", instructions="
					+ instructions + ", id =" + id + ", ingredients=" + ingredients + ", categories="
					+ categories + ", cuisine=" + cuisine + ", reviews=" + reviews + "]";
		}
	    
	    // Other fields, getters, setters
	    
	}



