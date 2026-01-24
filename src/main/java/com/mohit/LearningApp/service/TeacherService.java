package com.mohit.LearningApp.service;


import com.mohit.LearningApp.dto.AssignmentRequest;
import com.mohit.LearningApp.dto.SubjectRequest;
import com.mohit.LearningApp.entity.Assignment;
import com.mohit.LearningApp.entity.Subject;
import com.mohit.LearningApp.entity.User;
import com.mohit.LearningApp.repository.AssignmentRepository;
import com.mohit.LearningApp.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TeacherService {

    private final SubjectRepository subjectRepository;
    private final AssignmentRepository assignmentRepository;

    public TeacherService(SubjectRepository subjectRepository, AssignmentRepository assignmentRepository) {
        this.subjectRepository = subjectRepository;
        this.assignmentRepository = assignmentRepository;
    }

    // Create assignment
    public Assignment createAssignment(AssignmentRequest request) {
        Subject subject = subjectRepository.findById(request.getSubjectId())
                .orElseThrow(() -> new RuntimeException("Subject not found"));

        Assignment assignment = new Assignment();
        assignment.setTitle(request.getTitle());
        assignment.setDescription(request.getDescription());
        assignment.setMaxMarks(request.getMaxMarks());
        assignment.setDueDate(request.getDueDate());
        assignment.setSubject(subject);

        return assignmentRepository.save(assignment);
    }


    // Get all assignments
    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }


}
