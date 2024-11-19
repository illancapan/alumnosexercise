package com.alumnos.alumnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.alumnos.alumnos.model")
public class AlumnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlumnosApplication.class, args);
	}

}
