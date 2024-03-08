package com.example.spring.example.task2.component.service.userInputService;

import com.example.spring.example.task2.model.entity.Answer;
import com.example.spring.example.task2.model.entity.Question;

public interface UserInputService {
    String getUserInfo(String question);
    Answer getAnswer(Question question);
}
