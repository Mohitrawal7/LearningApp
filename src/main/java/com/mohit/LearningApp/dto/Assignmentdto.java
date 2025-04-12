package com.mohit.LearningApp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Assignmentdto {

    private Long id;
    private String title;
    private String description;
    private String assigner;
    private String AssignedTo;

}
