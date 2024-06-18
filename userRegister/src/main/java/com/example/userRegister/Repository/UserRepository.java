package com.example.userRegister.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userRegister.Entity.UserEntry;



public interface UserRepository extends JpaRepository<UserEntry,Long>{

   UserEntry findByUsername(String username); 
} 
