package com.example.spring.example.task2.component.repository;

import com.example.spring.example.task2.component.repository.repositoryService.StudentRepositoryService;
import com.example.spring.example.task2.model.entity.Student;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
public class StudentRepository implements StudentRepositoryService {
    private List<Student> studentList = new ArrayList<>();
    @Override
    public Student add(Student student) throws IllegalArgumentException {
        if (student != null) {
            this.studentList.add(student);

            return student;
        } else {
            throw new IllegalArgumentException("Student is null");
        }
    }

    @Override
    public List<Student> getStudensList() {
        return List.copyOf(studentList);
    }
}
