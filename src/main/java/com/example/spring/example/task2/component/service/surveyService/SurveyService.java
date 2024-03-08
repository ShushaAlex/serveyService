package com.example.spring.example.task2.component.service.surveyService;

import com.example.spring.example.task2.component.repository.QuestionRepository;
import com.example.spring.example.task2.model.entity.Student;

import java.util.List;

public interface SurveyService {
    Student getStudentInfo();

    void startSurvey();

    void getQuestions();
}
