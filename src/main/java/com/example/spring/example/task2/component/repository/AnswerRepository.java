package com.example.spring.example.task2.component.repository;

import com.example.spring.example.task2.component.repository.repositoryService.AnswerRepositoryService;
import com.example.spring.example.task2.model.entity.Answer;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class AnswerRepository implements AnswerRepositoryService {
    private List<Answer> answerList = new ArrayList<>();
    @Override
    public Answer add(Answer answer) throws IllegalArgumentException {
        if (answer != null) {
            this.answerList.add(answer);

            return answer;
        } else {
            throw new IllegalArgumentException("Answer is null");
        }
    }

    @Override
    public List<Answer> getAnswerList() {
        return List.copyOf(answerList);
    }
}
