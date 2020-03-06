package org.springcontainer.xml.di;

import org.springcontainer.xml.di.FortuneService;

public class BaseballCoach implements Coach {

	//define private field for the dependency 
	private FortuneService  fortuneService;
	
	//define constructor
	public BaseballCoach(FortuneService thefortuneService) {
		this.fortuneService= thefortuneService;
	}
	
	public String getDailyWorkOut() {
		return "Dribbling Practice for 30min";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
