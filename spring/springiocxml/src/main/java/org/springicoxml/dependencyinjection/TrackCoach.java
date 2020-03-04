package org.springicoxml.dependencyinjection;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService thefortuneService) {
		super();
		this.fortuneService = thefortuneService;
	}

	public String getDailyWorkOut() {
		return "Run hard a 5k";
	}

	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}

}
