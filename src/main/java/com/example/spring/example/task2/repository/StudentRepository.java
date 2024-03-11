package com.example.spring.example.task2.repository;

import com.example.spring.example.task2.dto.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentRepository {
    private List<Student> studentList = new ArrayList<>();
    public Student add(Student student) throws IllegalArgumentException {
        if (student != null) {
            this.studentList.add(student);

            return student;
        } else {
            throw new IllegalArgumentException("Student is null");
        }
    }

    public List<Student> getStudensList() {
        return List.copyOf(studentList);
    }
}
