package com.mohit.LearningApp.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Userdto {

    private Integer userid;
    private String username;
    private String email;
    private String password;

    public String getPassword() {
        return password;
    }
}
