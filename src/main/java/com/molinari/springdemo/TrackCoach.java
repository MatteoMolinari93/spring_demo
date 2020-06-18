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
		// TODO Auto-generated method stub
		return null;
	}

}
