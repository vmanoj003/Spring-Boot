package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.SpringBoot.*")
public class CourseAppApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(CourseAppApplication.class, args);

	}

}
