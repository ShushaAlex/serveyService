package com.example.spring.example.task2.repository;

import com.example.spring.example.task2.dto.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class QuestionRepository {
    private List<Question> questionList = new ArrayList<>();

    public Question add(Question question) throws IllegalArgumentException {
        if (question != null) {
            this.questionList.add(question);

            return question;
        } else {
            throw new IllegalArgumentException("Question is null");
        }
    }

    public List<Question> getQuestionsList() {

        return List.copyOf(questionList);
    }
}
