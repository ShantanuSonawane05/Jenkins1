package com.jenkinsjobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jenkins1Application {

	public static void main(String[] args) {
		System.out.println("Project is Runnig with Maven Build");
		SpringApplication.run(Jenkins1Application.class, args);
	}

}
