package com.example.spring.example.task2.component.service.surveyService;

import com.example.spring.example.task2.component.repository.AnswerRepository;
import com.example.spring.example.task2.component.repository.QuestionRepository;
import com.example.spring.example.task2.component.repository.StudentRepository;
import com.example.spring.example.task2.component.service.converter.ConverterToQuestion;
import com.example.spring.example.task2.component.service.userInputService.UserInputService;
import com.example.spring.example.task2.model.entity.Answer;
import com.example.spring.example.task2.model.entity.Question;
import com.example.spring.example.task2.model.entity.Student;
import com.example.spring.example.task2.util.ReedFileService;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class SurveyServiceImpl implements SurveyService {

    private QuestionRepository questionRepository;
    private StudentRepository studentRepository;
    private UserInputService userInputService;
    private AnswerRepository answerRepository;
    private ReedFileService reedFileService;
    private ConverterToQuestion converter;

    public SurveyServiceImpl(QuestionRepository questionRepository, StudentRepository studentRepository,
                             UserInputService userInputService, AnswerRepository answerRepository,
                             ReedFileService reedFileService, ConverterToQuestion converter) {
        this.questionRepository = questionRepository;
        this.studentRepository = studentRepository;
        this.userInputService = userInputService;
        this.answerRepository = answerRepository;
        this.reedFileService = reedFileService;
        this.converter = converter;
    }

    @Override
    public void getQuestions() {
        List<String> strings = reedFileService.getStringsListFromFile("/Users/alex/IdeaProjects/spring.example/src/main/resources/questions.txt");
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
