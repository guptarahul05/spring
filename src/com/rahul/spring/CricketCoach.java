package com.rahul.spring;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;  
	
	private String emailAddress;
	private String team;
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmailAddress() {
		System.out.println("CricketCoach: Inside setter - get email");
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter - set email");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		System.out.println("CricketCoach: Inside setter - get email");
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter - set team");

		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter - setFortuneService");
		this.fortuneService = fortuneService;
	}

	

}
