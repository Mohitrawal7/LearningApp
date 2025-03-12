package com.mohit.LearningApp.repository;

import com.mohit.LearningApp.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,Integer> {
}
