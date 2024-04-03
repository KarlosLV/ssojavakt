package com.apitest.ssosimulation;

import com.apitest.ssosimulation.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class SsosimulationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsosimulationApplication.class, args);
	}


}
