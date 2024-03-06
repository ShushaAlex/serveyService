package com.example.spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		SomeClassA someClassA = context.getBean("someClassA", SomeClassA.class);
		someClassA.doSomething();


		context.close();

	}

}
