package com.example.spring.example.task2.service.impl;

import com.example.spring.example.task2.service.UserInputService;
import com.example.spring.example.task2.dto.Answer;
import com.example.spring.example.task2.dto.Question;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component("userInputService")
class UserInputServiceImpl implements UserInputService {
    Scanner scanner = new Scanner(System.in);
    @Override
    public String getUserInfo(String question) {
        System.out.print(question + " ");
        return scanner.next();
    }

    @Override
    public Answer getAnswer(Question question) {
        Answer answer = new Answer();
        System.out.println(question.getQuestion() + " ");
        answer.setStudentAnswer(scanner.next());
        return answer;
    }
}
