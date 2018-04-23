package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.SpringBoot.*")
//@EnableJpaRepositories("com.SpringBoot.*")
public class CourseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApplication.class, args);
	}
}
