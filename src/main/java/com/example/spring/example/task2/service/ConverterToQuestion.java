package com.example.spring.example.task2.service;

import com.example.spring.example.task2.dto.Question;

public interface ConverterToQuestion {

    /**
     * convert string into Question
     * @param string
     * @return Question
     */
    Question stringToQuestion(String string);
}
