package com.molinari.springdemo;

public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BasketballCoach() {
		
	}
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "34 free throws";
	}

	public String getDailyFortune() {
		return "B:" + this.fortuneService.getFortune();
	}

}
