package com.alumnos.alumnos.controller;

import com.alumnos.alumnos.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private List<Student> studentList = new ArrayList<>();

    @GetMapping
    public List<Student> getAllStudents() {
        return studentList;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        studentList.add(student);
        return student;
    }

}
