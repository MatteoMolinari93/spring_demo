package com.molinari.springdemo;

public class RandomFortuneService implements FortuneService {

	public String getFortune() {
		return Math.random()+"";
	}

}
