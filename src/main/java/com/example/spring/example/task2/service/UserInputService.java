package com.example.spring.example.task2.service;

import com.example.spring.example.task2.dto.Answer;
import com.example.spring.example.task2.dto.Question;

public interface UserInputService {
    /**
     * get user information
     * @param question in String type
     * @return answer of the user in String type
     */
    String getUserInfo(String question);

    /**
     * ask user a question and returns answer
     * @param question in Question type
     * @return Answer
     */
    Answer getAnswer(Question question);
}
