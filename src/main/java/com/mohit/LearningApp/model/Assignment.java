package com.mohit.LearningApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "assignments")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "description" ,nullable = false)
    private String description;

    @Column(name = "assigner" )
    private String assigner;

    @Column(name = "AssignedTO",nullable = false)
    private String AssignedTo;



}

