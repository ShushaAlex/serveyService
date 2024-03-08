package com.example.spring.example.task2.component.service.converter.impl;

import com.example.spring.example.task2.component.service.converter.ConverterToQuestion;
import com.example.spring.example.task2.model.entity.Question;

public class ConverterToQuestionImpl implements ConverterToQuestion {

    @Override
    public Question stringToQuestion(String string) {
        Question question = new Question();
        String[] stringParts = string.split(";");
        question.setId(Integer.parseInt(stringParts[0]));
        question.setQuestion(stringParts[1]);
        question.setOptionsOfAnswer(stringParts[2]);
        question.setCorrectAnswer(stringParts[3]);

        return question;
    }
}