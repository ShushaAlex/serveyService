package com.example.spring.example.task2.component.repository;

import com.example.spring.example.task2.component.repository.repositoryService.StudentRepositoryService;
import com.example.spring.example.task2.model.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements StudentRepositoryService {
    private List<Student> studentList = new ArrayList<>();
    @Override
    public Student add(Student student) throws IllegalAccessException {
        if (student != null) {
            this.studentList.add(student);

            return student;
        } else {
            throw new IllegalAccessException("Student is null");
        }
    }

    @Override
    public List<Student> getStudensList() {
        return List.copyOf(studentList);
    }
}
