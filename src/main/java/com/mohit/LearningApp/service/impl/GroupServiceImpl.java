package com.mohit.LearningApp.service.impl;

import com.mohit.LearningApp.service.GroupService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class GroupServiceImpl implements GroupService {




        @PersistenceContext
        private EntityManager entityManager;

        public void createGroupTable(String groupName) {
            String sql = "CREATE TABLE " + groupName + " (...columns...)";
            entityManager.createNativeQuery(sql).executeUpdate();
        }




}
