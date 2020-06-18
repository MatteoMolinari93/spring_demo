package com.molinari.springdemo;

public class CriketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CriketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter fortuneService");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice fast bowling for 30 minutes";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
