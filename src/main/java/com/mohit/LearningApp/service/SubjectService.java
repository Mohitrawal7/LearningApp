//package com.mohit.LearningApp.service;
//
//
//import com.mohit.LearningApp.entity.Subject;
//import com.mohit.LearningApp.entity.User;
//import com.mohit.LearningApp.repository.SubjectRepository;
//import com.mohit.LearningApp.repository.UserRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class SubjectService {
//
//    private SubjectRepository subjectRepository;
//    private UserRepository userRepository;
//
//
//    //  Create subject
//    public Subject createSubject(Subject subject) {
//
//        Subject sub = new Subject();
//        sub.setName(subject.getName());
//        sub.setDescription(subject.getDescription());
//        sub.setTeacher(subject.getTeacher());
//
//        return subjectRepository.save(sub);
//    }
//
//    //  Get all subjects
//    public List<Subject> getAllSubjects() {
//        return subjectRepository.findAll();
//    }
//
//    //  Assign teacher to subject
//    public Subject assignTeacher(Long subjectId, Long teacherId) {
//        Subject subject = subjectRepository.findById(subjectId)
//                .orElseThrow(() -> new RuntimeException("Subject not found"));
//
//        User teacher = userRepository.findById(teacherId)
//                .orElseThrow(() -> new RuntimeException("Teacher not found"));
//
//        if (teacher.getRole() != "TEACHER") {
//            throw new RuntimeException("User is not a teacher");
//        }
//
//        subject.setTeacher(teacher);
//        return subjectRepository.save(subject);
//    }
//
//}
//


package com.mohit.LearningApp.service;

import com.mohit.LearningApp.dto.SubjectRequest;
import com.mohit.LearningApp.entity.Subject;
import com.mohit.LearningApp.entity.User;
import com.mohit.LearningApp.repository.SubjectRepository;
import com.mohit.LearningApp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;
    private final UserRepository userRepository;

    public SubjectService(SubjectRepository subjectRepository, UserRepository userRepository) {
        this.subjectRepository = subjectRepository;
        this.userRepository = userRepository;
    }

    // Create subject
    public Subject createSubject(SubjectRequest request) {

        User teacher = userRepository.findById(request.getTeacherId())
                .orElseThrow(() -> new RuntimeException("Teacher not found"));

        Subject subject = new Subject();
        subject.setName(request.getName());
        subject.setDescription(request.getDescription());
        subject.setTeacher(teacher);

        return subjectRepository.save(subject);
    }

    // Get all subjects
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    // Assign teacher to subject
    public Subject assignTeacher(Long subjectId, Long teacherId) {
        Subject subject = subjectRepository.findById(subjectId)
                .orElseThrow(() -> new RuntimeException("Subject not found"));

        User teacher = userRepository.findById(teacherId)
                .orElseThrow(() -> new RuntimeException("Teacher not found"));

        if (!"TEACHER".equals(teacher.getRole())) {
            throw new RuntimeException("User is not a teacher");
        }

        subject.setTeacher(teacher);
        return subjectRepository.save(subject);
    }
}
