package com.javasim.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavademoApplication.class, args);
    }

    @RequestMapping("/")
    public String helloworld() {
        return "Hello World";
    }
}