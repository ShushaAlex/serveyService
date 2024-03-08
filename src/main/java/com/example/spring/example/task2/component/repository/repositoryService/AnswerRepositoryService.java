package com.example.spring.example.task2.component.repository.repositoryService;

import com.example.spring.example.task2.model.entity.Answer;

import java.util.List;

public interface AnswerRepositoryService {
    /**
     * add answer to answers list
     * @param answer
     * @return returns the passed argument answer
     */
    Answer add(Answer answer);

    /**
     * Return copy of collection of Answer
     * @return copy of List<Answer>
     */
    List<Answer> getAnswerList();
}
