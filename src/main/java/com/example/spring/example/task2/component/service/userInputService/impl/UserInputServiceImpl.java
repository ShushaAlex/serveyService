package com.example.spring.example.task2.component.service.userInputService.impl;

import com.example.spring.example.task2.component.service.userInputService.UserInputService;

import java.util.Scanner;

public class UserInputServiceImpl implements UserInputService {
    Scanner scanner = new Scanner(System.in);
    @Override
    public String getUserInfo(String question) {
        System.out.print(question);
        return scanner.next();
    }
}
