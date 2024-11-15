package com.alumnos.alumnos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Student {

    private int id;
    private String name;
    private String lastName;
    private int age;
    private String email;
    private String address;
    private LocalDate enrollmentDate;
    private Status status;
    private List<Grade> grades;
    private List<Course> courses;

}
