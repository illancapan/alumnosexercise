package com.alumnos.alumnos.dto.student;

import com.alumnos.alumnos.model.Status;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class StudentDTO {
    @NotEmpty(message = "El nombre es requerido")
    private String name;

    @NotEmpty(message = "El apellido es requerido")
    private String lastName;

    @Min(16)
    private int age;

    @Email(message = "Email debe ser válido")
    private String email;

    private String address;
    private Status status;
    private Integer gradeId;
}
