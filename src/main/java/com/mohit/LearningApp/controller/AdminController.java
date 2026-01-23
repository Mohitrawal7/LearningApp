package com.mohit.LearningApp.controller;

import com.mohit.LearningApp.dto.RegisterRequest;
import com.mohit.LearningApp.entity.Subject;
import com.mohit.LearningApp.entity.User;
import com.mohit.LearningApp.repository.UserRepository;
import com.mohit.LearningApp.service.SubjectService;
import com.mohit.LearningApp.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/admin")
//@PreAuthorize("hasRole('ADMIN')")
public class AdminController {


private final UserService userService;
private final UserRepository userRepository;

    public AdminController(UserService userService,UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    //create users
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(userService.createUser(request));
    }

    //  Get all users
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    //  Delete user
    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }




}
