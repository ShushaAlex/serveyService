package com.example.spring.example.task2.model.entity;

import lombok.Data;

@Data
public class Answer {
    private Question question;
    private Student student;
    private String studentAnswer;
}
