package com.molinari.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		
		// we check if they are the same
		boolean result = (coach == coach2);

		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for first coach: " + coach);
		System.out.println("\nMemory location for second coach: " + coach2);


		context.close();

	}

}
