package com.alumnos.alumnos.dto.grade;

import lombok.Data;

import java.util.List;

@Data
public class GradeResponseDTO {
    private Integer id;
    private String name;
    private String description;
    private Integer numberOfStudents;  // cantidad de estudiantes en el grado
    private List<String> courseNames;  // lista de nombres de cursos en este grado
}