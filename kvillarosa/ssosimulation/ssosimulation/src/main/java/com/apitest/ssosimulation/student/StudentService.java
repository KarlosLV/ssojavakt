package com.apitest.ssosimulation.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Karlos Lucas Villarosa",
                        "k.lucas.villarosa@gmail.com",
                        LocalDate.of(1999, 2, 7),
                        21
                )
        );
    }

    
}
