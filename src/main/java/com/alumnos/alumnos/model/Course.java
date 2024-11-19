package com.alumnos.alumnos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int credits;

    @ManyToOne
    @JoinColumn(name = "grade_id")
    private Grade grade;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

}
