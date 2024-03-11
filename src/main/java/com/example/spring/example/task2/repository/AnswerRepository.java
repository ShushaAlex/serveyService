package com.example.spring.example.task2.repository;

import com.example.spring.example.task2.dto.Answer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class AnswerRepository {

    private List<Answer> answerList = new ArrayList<>();

    public Answer add(Answer answer) throws IllegalArgumentException {
        if (answer != null) {
            this.answerList.add(answer);

            return answer;
        } else {
            throw new IllegalArgumentException("Answer is null");
        }
    }

    public List<Answer> getAnswerList() {
        return List.copyOf(answerList);
    }
}
