package com.example.studentrestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private Student latestStudent = new Student(1, "Aarav Sharma", "Web Development");

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Student Management REST API";
    }

    @GetMapping("/student")
    public Student getStudent() {
        return latestStudent;
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        latestStudent = student;
        return latestStudent;
    }
}
