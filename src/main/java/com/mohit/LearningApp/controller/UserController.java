package com.mohit.LearningApp.controller;


import com.mohit.LearningApp.dto.Userdto;
import com.mohit.LearningApp.model.User;
import com.mohit.LearningApp.service.UserService;
import com.mohit.LearningApp.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

   private UserService service;

    @RequestMapping("gone")
    public String Gg(){
        return "asj";
    }

   @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser(){
        return new ResponseEntity<>(service.getAllUser(), HttpStatus.OK);
   }



}
