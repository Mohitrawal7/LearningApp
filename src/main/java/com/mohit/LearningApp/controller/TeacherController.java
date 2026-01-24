package com.mohit.LearningApp.controller;

import com.mohit.LearningApp.dto.AssignmentRequest;
import com.mohit.LearningApp.dto.SubjectRequest;
import com.mohit.LearningApp.entity.Assignment;
import com.mohit.LearningApp.entity.Subject;
import com.mohit.LearningApp.service.SubjectService;
import com.mohit.LearningApp.service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
public class TeacherController {



    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    // Create Assignment
    @PostMapping
    public ResponseEntity<Assignment> createAssignment (@RequestBody AssignmentRequest request){
        return ResponseEntity.ok(teacherService.createAssignment(request));
    }

    // Get all Assignment
    @GetMapping
    public ResponseEntity<List<Assignment>> getAllAssignments() {
        return ResponseEntity.ok(teacherService.getAllAssignments());
    }



}
