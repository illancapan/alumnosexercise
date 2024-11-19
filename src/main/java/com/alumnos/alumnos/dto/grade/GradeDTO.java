package com.alumnos.alumnos.dto.grade;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class GradeDTO {
    @NotEmpty(message = "El nombre es requerido")
    private String name;

    private String description;
}
