package com.example.spring.example.task2.dto;

import lombok.Data;

@Data
public class Question {
    private int id;
    private String question;
    private String optionsOfAnswer;
    private String correctAnswer;
}
