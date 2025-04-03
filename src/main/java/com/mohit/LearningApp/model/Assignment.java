package com.mohit.LearningApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "assignments") // Optional: maps to a specific table name
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Other fields, getters, setters
}
