package com.alumnos.alumnos.service;

import com.alumnos.alumnos.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private List<Student> studentList = new ArrayList<>();

    public List<Student> getAllStudents() {
        return studentList;
    }

    public Student getStudentById(int id) {
        Optional<Student> student = studentList.stream().filter(s -> s.getId() == id).findFirst();
        return student.orElse(null);
    }

    public Student addStudent(Student student) {
        Optional<Student> existingStudent = studentList.stream()
                .filter(stu -> stu.getId() == student.getId())
                .findFirst();
        if (existingStudent.isPresent()) {
            throw new IllegalArgumentException("A student with this ID already exists.");
        }
        studentList.add(student);
        return student;
    }

    public Student updateStudent(int id, Student updatedStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.set(i, updatedStudent);
                return updatedStudent;
            }
        }
        return null;
    }

    public boolean deleteStudent(int id) {
        return studentList.removeIf(student -> student.getId() == id);
    }

}
