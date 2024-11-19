package com.alumnos.alumnos.dto.student;

import com.alumnos.alumnos.model.Status;
import lombok.Data;

import java.util.List;

@Data
public class StudentResponseDTO {

    private Integer id;
    private String name;
    private String lastName;
    private int age;
    private String email;
    private Status status;
    private String gradeName;
    private List<String> courseNames;
}
