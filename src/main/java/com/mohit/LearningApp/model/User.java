package com.mohit.LearningApp.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq_generator")
    @SequenceGenerator(
            name = "user_seq_generator",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @Column(name = "userid", nullable = false )
    private Integer userid;

    @Column(name = "username",nullable = false,unique = true)
    private String username;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name ="password",nullable = false)
    private String password;

    @Column(name = "active",nullable = false)
    private boolean active;

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
