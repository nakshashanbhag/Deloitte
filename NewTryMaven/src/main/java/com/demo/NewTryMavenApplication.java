package com.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class NewTryMavenApplication {
	
	@RequestMapping("firstMessage")
	public String getMessage() {
		return("Its the first Message!!");
	}
	
	@RequestMapping("/secondMessage")
	public String getBye() {
		return("Its the first Message");
	}
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(NewTryMavenApplication.class, args);
	}

}
