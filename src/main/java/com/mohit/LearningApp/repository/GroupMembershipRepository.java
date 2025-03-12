package com.mohit.LearningApp.repository;

import com.mohit.LearningApp.model.GroupMembership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMembershipRepository extends JpaRepository<GroupMembership,Integer> {
}
