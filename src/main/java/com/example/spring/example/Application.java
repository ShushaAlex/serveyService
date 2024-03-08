package com.example.spring.example;

import com.example.spring.example.task2.component.repository.AnswerRepository;
import com.example.spring.example.task2.component.repository.StudentRepository;
import com.example.spring.example.task2.component.service.surveyService.SurveyService;
import com.example.spring.example.task2.component.service.surveyService.SurveyServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

//		SomeClassA someClassA = context.getBean("someClassA", SomeClassA.class);
//		someClassA.doSomething();

		SurveyService surveyService = context.getBean("surveyServiceImpl", SurveyServiceImpl.class);
		StudentRepository studentRepository = context.getBean("studentRepository", StudentRepository.class);
		AnswerRepository answerRepository = context.getBean("answerRepository", AnswerRepository.class);

		surveyService.startSurvey();


		System.out.println(studentRepository.getStudensList());
		System.out.println(answerRepository.getAnswerList());



		context.close();

	}

}
