package org.springcontainer.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String... val) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach",Coach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkOut());
		
		// close the context
		context.close();
	}
}

