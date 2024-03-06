package com.example.spring.example.task2.component.service.surveyService;

import com.example.spring.example.task2.component.repository.QuestionRepository;
import com.example.spring.example.task2.component.repository.StudentRepository;
import com.example.spring.example.task2.component.service.userInputService.UserInputService;
import com.example.spring.example.task2.model.entity.Student;

public class SurveyServiceImpl implements SurveyService {

    QuestionRepository questionRepository;
    StudentRepository studentRepository;
    UserInputService userInputService;
    @Override
    public Student getStudentInfo() {
        Student student = new Student();
        //userInputService.getUserInfo()
        return null;
    }

    @Override
    public void startSurvey() {

    }
}
