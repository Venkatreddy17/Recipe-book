package com.example.RecipeBook.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Ingredient {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String name;
	    private double quantity;
	    private String measurementUnit;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getQuantity() {
			return quantity;
		}
		public void setQuantity(double quantity) {
			this.quantity = quantity;
		}
		public String getMeasurementUnit() {
			return measurementUnit;
		}
		public void setMeasurementUnit(String measurementUnit) {
			this.measurementUnit = measurementUnit;
		}
		@Override
		public String toString() {
			return "Ingredient [id=" + id + ", name=" + name + ", quantity=" + quantity + ", measurementUnit="
					+ measurementUnit + "]";
		}
	    
	    // Other fields, getters, setters
	    
	}



