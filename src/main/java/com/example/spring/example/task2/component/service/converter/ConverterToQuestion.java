package com.example.spring.example.task2.component.service.converter;

import com.example.spring.example.task2.model.entity.Question;

public interface ConverterToQuestion {

    Question stringToQuestion(String string);
}
