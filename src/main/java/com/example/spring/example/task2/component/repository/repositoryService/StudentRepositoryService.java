package com.example.spring.example.task2.component.repository.repositoryService;

import com.example.spring.example.task2.model.entity.Student;

import java.util.List;

public interface StudentRepositoryService {
    /**
     * Add student to the StudentRepository
     * @param student
     * @return student from the param
     */
    Student add(Student student) throws IllegalAccessException;

    /**
     * Return copy of collection from QuestionRepository
     * @return copy of List<Question>
     */
    List<Student> getStudensList();
}
