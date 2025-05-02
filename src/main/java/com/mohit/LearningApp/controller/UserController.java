package com.mohit.LearningApp.controller;


import com.mohit.LearningApp.dto.Userdto;
import com.mohit.LearningApp.model.User;
import com.mohit.LearningApp.service.UserService;
import com.mohit.LearningApp.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    public UserService service;

    @RequestMapping("gone")
    public String Gg(){
        return "asj";
    }

    @PostMapping("/register")
    public ResponseEntity<?> save(Userdto dto){
        Userdto dto1 = service.save(dto);
        return new ResponseEntity<>(dto1,HttpStatus.OK);
    }

   @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser(){
        return new ResponseEntity<>(service.getAllUser(), HttpStatus.OK);
   }



}
