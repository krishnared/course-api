package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// this Annotation tells spring boot
// that this is the starting point of the application 

public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
		// Telling spring boot to start the application
		// (class name , any arguments) 

	}

}
 