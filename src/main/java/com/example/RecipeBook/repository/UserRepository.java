package com.example.RecipeBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RecipeBook.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
