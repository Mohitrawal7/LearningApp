package com.mohit.LearningApp.repository;

import com.mohit.LearningApp.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment,Integer> {

}
