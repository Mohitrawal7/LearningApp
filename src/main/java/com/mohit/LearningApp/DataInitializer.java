package com.mohit.LearningApp;


import com.mohit.LearningApp.entity.User;
import com.mohit.LearningApp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DataInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.findByUsername("admin").isEmpty()) {
            System.out.println("Creating default admin user...");
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("password"));
            admin.setRole("admin");
            admin.setEmail("reaj12@dmail.com");
            admin.setCreatedAt(LocalDate.of(2005,05,06));
            userRepository.save(admin);
            System.out.println("Default admin user created.");
        }
    }
}