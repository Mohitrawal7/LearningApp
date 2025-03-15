package com.mohit.LearningApp.controller;

import com.mohit.LearningApp.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/continue")
     String use(){
        return "defoamer";
    }


    @GetMapping("/public/home")
    public String publicHome() {
        return "Welcome to Public Home!";
    }

    @GetMapping("/user/home")
    public String userHome() {
        return "Welcome, User!";
    }

    @GetMapping("/admin/home")
    public String adminHome() {
        return "Welcome, Admin!";
    }


}
