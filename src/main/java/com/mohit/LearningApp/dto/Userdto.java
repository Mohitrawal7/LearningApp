package com.mohit.LearningApp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Builder
public class Userdto {

    @Id
private Integer userid;
private String username;
private String password;
private String email;
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
