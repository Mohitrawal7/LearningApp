package com.mohit.LearningApp.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Userdto {

    private Integer userid;
    private String username;
    private String email;
    private String password;

}
