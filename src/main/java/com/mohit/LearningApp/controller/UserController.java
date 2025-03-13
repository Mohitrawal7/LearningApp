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

}
