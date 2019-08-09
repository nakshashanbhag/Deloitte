package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NewTryMaven1Application {
	
	
	@RequestMapping("/firstMessage")
	public String getFirstMessage() {
		return("FirstMessage!!");
	}
	
	@RequestMapping("/secondMessage")
	public String getSecondMessage() {
		return("secondMessage");
	}
	
	@RequestMapping("/thirdMessage")
	public String getThirdMessage() {
		return("thirdMessage");
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(NewTryMaven1Application.class, args);
	}

}
