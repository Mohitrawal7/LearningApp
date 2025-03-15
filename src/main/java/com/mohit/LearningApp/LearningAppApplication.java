package com.mohit.LearningApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LearningAppApplication {



	@RequestMapping("/co")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(LearningAppApplication.class, args);
	}



	}


