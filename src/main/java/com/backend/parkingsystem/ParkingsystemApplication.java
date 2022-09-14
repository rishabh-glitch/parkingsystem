package com.backend.parkingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingsystemApplication.class, args);
		System.out.println("Server Started...");
	}

}
