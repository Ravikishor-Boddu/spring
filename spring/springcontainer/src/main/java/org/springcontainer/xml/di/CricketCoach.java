package org.springcontainer.xml.di;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String team;
	private String email;
	
	public CricketCoach() {
		System.out.println("Inside no-arg constructor of CricketCoach");
	}
	public String getDailyWorkOut() {
		return "Do daily bowling practice for an hour";
	}

	public String getDailyFortune() {
		return "Ah!! Yeah :" + fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method: setFortuneService");
		this.fortuneService = fortuneService;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("Inside setter method: setTeam");
		this.team = team;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Inside setter method: setEmail");
		this.email = email;
	}

}
