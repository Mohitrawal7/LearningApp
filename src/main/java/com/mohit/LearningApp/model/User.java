package com.mohit.LearningApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
public class User {

    @Id
    @Column(name = "userid", nullable = false )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq_generator")
    private Integer userid;

    @Column(name = "username",nullable = false,unique = true)
    private String username;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name ="password",nullable = false)
    private String password;

    @Column(name = "active",nullable = false)
    private boolean active;

}
