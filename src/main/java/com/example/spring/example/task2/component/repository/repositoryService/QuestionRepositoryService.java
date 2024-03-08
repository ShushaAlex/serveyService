package com.example.spring.example.task2.component.repository.repositoryService;

import com.example.spring.example.task2.model.entity.Question;

import java.util.List;

public interface QuestionRepositoryService {
    /**
     * Add question to the QuestionRepository
     * @param question
     * @return question from the param
     */
    Question add(Question question);

    /**
     * Return copy of collection from QuestionRepository
     * @return copy of List<Question>
     */
    List<Question> getQuestionsList();
}
