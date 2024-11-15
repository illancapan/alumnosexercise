package com.alumnos.alumnos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Grade {
    private String subject;
    private double score;
    private LocalDate date;
}
