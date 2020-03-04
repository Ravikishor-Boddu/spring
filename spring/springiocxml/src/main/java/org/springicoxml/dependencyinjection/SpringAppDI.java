package org.springicoxml.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppDI {

	public static void main(String... val) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-di.xml");

		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach",Coach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();
	}
}

