package com.mohit.LearningApp.repository;

import com.mohit.LearningApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
