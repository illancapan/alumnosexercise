package com.alumnos.alumnos.controller;

import com.alumnos.alumnos.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private List<Student> studentList = new ArrayList<>();

}
