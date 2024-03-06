package com.example.spring.example.task2.component.service.userOutputService;

public interface userOutput {
    /**
     * This method requests information from user
     * @param question question that will be asked
     */
    void askUser(String question);

    /**
     * This method shows user options for answer
     * @param choiceOption options that will be shown
     */
    void showMultipleChoiceOptions(String choiceOption);

}
