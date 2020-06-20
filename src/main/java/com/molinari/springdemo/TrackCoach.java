package com.molinari.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Do it on the track!";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	public void onInit() {
		System.out.println("TrackCoach: onInit");
	}
	
	public void onDestroy() {
		System.out.println("TrackCoach: onDestroy");
	}

}
