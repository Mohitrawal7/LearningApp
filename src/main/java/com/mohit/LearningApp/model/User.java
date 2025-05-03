package com.mohit.LearningApp.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Builder
@Table(name = "users")
public class User {

    @Id
    @Column(name = "userid")
    private Integer userid;

    @Column(name = "username",nullable = false,unique = true)
    private String username;

    @Column(name = "password" ,nullable = false)
    private String password;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "active")
    private Boolean active;

    public Integer getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getActive() {
        return active;
    }





}