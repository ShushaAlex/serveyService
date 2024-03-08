package com.example.spring.example.task2.component.service.converter;

import com.example.spring.example.task2.model.entity.Question;

public interface ConverterToQuestion {

    /**
     * convert string into Question
     * @param string
     * @return Question
     */
    Question stringToQuestion(String string);
}
