package com.example.spring.example.task2.service;

import com.example.spring.example.task2.dto.Student;

public interface SurveyService {
    /**
     * collect student information and make new Student
     * @return Student
     */
    Student getStudentInfo();

    /**
     * create Questions and add them to the repository
     */
    void getQuestions();

    /**
     * collect answers of the students and add them to the repository
     */
    void getAnswers();

    /**
     * begin survey
     */
    void startSurvey();
}
