package com.mohit.LearningApp.repository;

import com.mohit.LearningApp.model.Group;
import org.hibernate.annotations.processing.SQL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GroupRepository extends JpaRepository<Group,Integer> {



}
