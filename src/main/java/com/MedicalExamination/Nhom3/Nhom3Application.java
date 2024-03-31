package com.MedicalExamination.Nhom3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class Nhom3Application {

	public static void main(String[] args) {
		SpringApplication.run(Nhom3Application.class, args);
	}

}
