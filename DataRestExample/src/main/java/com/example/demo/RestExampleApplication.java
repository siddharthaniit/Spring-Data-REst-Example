package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Register;

@SpringBootApplication
public class RestExampleApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(RestExampleApplication.class, args);
		
	}
	
	@Bean
	Register onBeforeSave(){
		return new Register();
	} 
}
