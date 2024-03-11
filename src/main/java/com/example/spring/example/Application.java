package com.example.spring.example;

import com.example.spring.example.task2.service.SurveyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		SurveyService surveyService = context.getBean("surveyService", SurveyService.class);

		surveyService.startSurvey();


		context.close();

	}

}
