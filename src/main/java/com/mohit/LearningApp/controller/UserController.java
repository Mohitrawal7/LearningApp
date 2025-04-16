package com.mohit.LearningApp.controller;


import com.mohit.LearningApp.dto.Userdto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @RequestMapping("gone")
    public String Gg(){
        return "asj";
    }





}
