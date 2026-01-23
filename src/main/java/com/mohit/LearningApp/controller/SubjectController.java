package com.mohit.LearningApp.controller;

import com.mohit.LearningApp.dto.SubjectRequest;
import com.mohit.LearningApp.entity.Subject;
import com.mohit.LearningApp.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

      private final SubjectService subjectService;

      public SubjectController(SubjectService subjectService) {
            this.subjectService = subjectService;
      }

      // Create subject
      @PostMapping
      public ResponseEntity<Subject> createSubject(@RequestBody SubjectRequest request) {
            return ResponseEntity.ok(subjectService.createSubject(request));
      }

      // Get all subjects
      @GetMapping
      public ResponseEntity<List<Subject>> getAllSubjects() {
            return ResponseEntity.ok(subjectService.getAllSubjects());
      }

      // Assign teacher to subject
      @PutMapping("/{subjectId}/teacher/{teacherId}")
      public ResponseEntity<Subject> assignTeacher(
              @PathVariable Long subjectId,
              @PathVariable Long teacherId) {

            return ResponseEntity.ok(
                    subjectService.assignTeacher(subjectId, teacherId)
            );
      }
}
