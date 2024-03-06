package com.example.spring.example.task2.component.repository;

import com.example.spring.example.task2.component.repository.repositoryService.QuestionRepositoryService;
import com.example.spring.example.task2.model.entity.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionRepository implements QuestionRepositoryService {
    private List<Question> questionList = new ArrayList<>();

    @Override
    public Question add(Question question) throws IllegalAccessException {
        if (question != null) {
            this.questionList.add(question);

            return question;
        } else {
            throw new IllegalAccessException("Question is null");
        }
    }

    @Override
    public List<Question> getQuestionsList() {

        return List.copyOf(questionList);
    }
}
