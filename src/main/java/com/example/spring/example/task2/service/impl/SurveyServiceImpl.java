package com.example.spring.example.task2.service.impl;

import com.example.spring.example.task2.repository.AnswerRepository;
import com.example.spring.example.task2.repository.QuestionRepository;
import com.example.spring.example.task2.repository.StudentRepository;
import com.example.spring.example.task2.service.ConverterToQuestion;
import com.example.spring.example.task2.service.SurveyService;
import com.example.spring.example.task2.service.UserInputService;
import com.example.spring.example.task2.dto.Answer;
import com.example.spring.example.task2.dto.Question;
import com.example.spring.example.task2.dto.Student;
import com.example.spring.example.task2.util.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@PropertySource("classpath:application.properties")
@Component("surveyService")
@RequiredArgsConstructor
 class SurveyServiceImpl implements SurveyService {

    private final QuestionRepository questionRepository;
    private final StudentRepository studentRepository;
    private final UserInputService userInputService;
    private final AnswerRepository answerRepository;
    private final ConverterToQuestion converter;
    @Value("${file.path.questions}")
    private String filePath;

    @Override
    public void getQuestions() {
        List<String> strings = Utils.getStringsListFromFile(filePath);
        for (String string : strings) {
            Question question = converter.stringToQuestion(string);
            questionRepository.add(question);
        }
    }

    @Override
    public Student getStudentInfo() {
        Student student = new Student();
        student.setName(userInputService.getUserInfo("What is your name?"));
        student.setSecondName(userInputService.getUserInfo("What is your second name?"));
        student.setGroupId(Integer.parseInt((userInputService.getUserInfo("What is your group id?"))));
        return studentRepository.add(student);
    }

    @Override
    public void getAnswers() {
        Student student = getStudentInfo();
        List<Question> questionList = questionRepository.getQuestionsList();
        for (Question question : questionList) {
            Answer answer = userInputService.getAnswer(question);
            answer.setStudent(student);
            answer.setQuestion(question);
            answerRepository.add(answer);
        }

    }

    @Override
    public void startSurvey() {
        getQuestions();
        getAnswers();
    }

}
