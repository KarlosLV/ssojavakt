package com.apitest.ssosimulation.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student){
        Optional<Student> studentOptional = studentRepository.findByStudentEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("Email is already taken");
        }
        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("Student with ID: " + studentId + " does not exist.");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
}
