package com.mohit.LearningApp.repository;

import com.mohit.LearningApp.model.GroupMembership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMembershipRepository extends JpaRepository<GroupMembership,Integer> {
}
