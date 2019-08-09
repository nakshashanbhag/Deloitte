package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OurFirstSpringBootApplication {
	
	@RequestMapping("/sayMessage")
	public String getMessage() {
		return("Congrats!!");
	}
	
	@RequestMapping("/sayBye")
	public String getBye() {
		return("GoodBye");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OurFirstSpringBootApplication.class, args);
	}

}
