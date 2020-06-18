package com.molinari.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Do it!";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune() ;
	}
}
