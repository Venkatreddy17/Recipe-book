package com.example.RecipeBook.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RecipeBook.entity.Cuisine;
import com.example.RecipeBook.service.CuisineService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CuisineController {

    @Autowired
    private CuisineService cuisineService;

    @GetMapping("/cuisines/")
    public List<Cuisine> getAllCuisines() {
        return cuisineService.getAllCuisines();
    }

    @GetMapping("/cuisines/{id}")
    public ResponseEntity<Cuisine> getCuisineById(@PathVariable Long id) {
        java.util.Optional<Cuisine> cuisine = cuisineService.getCuisineById(id);
        return cuisine.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/cuisines/")
    public Cuisine addCuisine(@RequestBody Cuisine cuisine) {
        return cuisineService.addCuisine(cuisine);
    }

    @PutMapping("/cuisines/{id}")
    public ResponseEntity<Cuisine> updateCuisine(@PathVariable Long id, @RequestBody Cuisine updatedCuisine) {
        java.util.Optional<Cuisine> cuisine = cuisineService.updateCuisine(id, updatedCuisine);
        return cuisine.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/cuisines/{id}")
    public ResponseEntity<Void> deleteCuisine(@PathVariable Long id) {
        cuisineService.deleteCuisine(id);
        return ResponseEntity.noContent().build();
    }
}



