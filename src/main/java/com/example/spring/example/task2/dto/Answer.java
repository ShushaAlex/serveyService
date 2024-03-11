package com.example.spring.example.task2.dto;

import lombok.Data;

@Data
public class Answer {
    private Question question;
    private Student student;
    private String studentAnswer;
}
