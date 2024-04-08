package com.apitest.ssosimulation.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student lucas = new Student(
                    "Karlos Lucas Villarosa",
                    "k.lucas.villarosa@gmail.com",
                    LocalDate.of(1999, Month.FEBRUARY, 7)
            );

            Student karlos = new Student(
                    "Karlos Lucas Villarosa",
                    "zxckarlos@gmail.com",
                    LocalDate.of(1999, Month.DECEMBER, 7)
            );
            repository.saveAll(
                    List.of(lucas,karlos)
            );
        };

    }

}
