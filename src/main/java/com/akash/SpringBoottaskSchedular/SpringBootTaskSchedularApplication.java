package com.akash.SpringBoottaskSchedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootTaskSchedularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTaskSchedularApplication.class, args);
	}

}