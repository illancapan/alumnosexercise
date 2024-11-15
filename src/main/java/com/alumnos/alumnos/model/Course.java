package com.alumnos.alumnos.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Course {
    private String courseId;
    private String courseName;
    private int credits;
}
