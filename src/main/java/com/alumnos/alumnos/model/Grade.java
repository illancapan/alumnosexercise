package com.alumnos.alumnos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "grade")
    private Set<Student> students;

    @OneToMany(mappedBy = "grade")
    private Set<Course> courses;


}
