package com.SpringBoot.RestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.SpringBoot.*")
public class MainRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(MainRun.class,args);

	}

}
