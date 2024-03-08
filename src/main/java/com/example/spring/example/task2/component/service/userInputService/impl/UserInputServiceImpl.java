package com.example.spring.example.task2.component.service.userInputService.impl;

import com.example.spring.example.task2.component.service.userInputService.UserInputService;
import com.example.spring.example.task2.model.entity.Answer;
import com.example.spring.example.task2.model.entity.Question;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class UserInputServiceImpl implements UserInputService {
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
