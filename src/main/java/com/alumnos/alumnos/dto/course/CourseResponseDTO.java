package com.alumnos.alumnos.dto.course;

import lombok.Data;

@Data
public class CourseResponseDTO {
    private Integer id;
    private String name;
    private String description;
    private String gradeName;
    private Integer numberOfStudents;  // cantidad de estudiantes en el curso
}