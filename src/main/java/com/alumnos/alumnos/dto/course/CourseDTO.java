package com.alumnos.alumnos.dto.course;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CourseDTO {
    @NotEmpty(message = "El nombre es requerido")
    private String name;

    private String description;
    private Integer gradeId;
}
