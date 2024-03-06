package com.example.spring.example.task2.model.entity;

import lombok.Data;

@Data
public class Question {
    private int id;
    private String question;
    private String optionsOfAnswer;
    private String correctAnswer;
}
