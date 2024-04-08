package com.javaKT.ronieTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RonieTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RonieTestApplication.class, args);
	}

	@RequestMapping("/")
	public String helloworld() {
		return "hello";
	}
}
