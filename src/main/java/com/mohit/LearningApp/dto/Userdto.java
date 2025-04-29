package com.mohit.LearningApp.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Userdto {

    private Integer userid;
    private String username;
    private String email;
    private String password;
    private Boolean active;


}
