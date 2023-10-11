package com.foodies.foodies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodies.foodies.model.User;
 
public interface UserRepository extends JpaRepository<User, String>{
    
}