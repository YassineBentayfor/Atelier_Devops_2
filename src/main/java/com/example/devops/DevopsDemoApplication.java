package com.example.devops;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
	}
	@PostConstruct
	public void onApplicationStart() {
		System.out.println("Spring Boot application started successfully!");
		System.out.println("Dev modifs");
	}

}
