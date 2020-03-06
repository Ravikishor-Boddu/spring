package org.springcontainer.xml.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppDISetter {

	public static void main(String... val) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-di.xml");

		// retrieve bean from spring container
		CricketCoach coach = context.getBean("myCoach",CricketCoach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getTeam());
		
		System.out.println(coach.getEmail());
		
		// close the context
		context.close();
	}
}

