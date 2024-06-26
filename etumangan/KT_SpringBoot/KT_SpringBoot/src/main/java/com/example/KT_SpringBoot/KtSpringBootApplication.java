package com.example.KT_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KtSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(KtSpringBootApplication.class, args);
	}

	@RequestMapping("/")
	public String SayHelloWorld(){
		return "HelloWorld";
	}
}
