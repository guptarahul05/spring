package com.rahul.spring;

public class BaseballCoach implements Coach {
	//define a private field 
	private FortuneService fortuneService;
	//define constructor
	
	public BaseballCoach(FortuneService theFortuneService) {
		System.out.println("Inside BaseBall Coach Consytructors");
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spent 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneservice to get fortune
		return fortuneService.getFortune();
	}
}
