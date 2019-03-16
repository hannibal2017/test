package com.test.design_patterns.template;

public class Football extends Game {

	@Override
	void initial() {
		System.out.println("initial Football");
	}

	@Override
	void startPlay() {
		System.out.println("startPlay Football");
	}

	@Override
	void endPlay() {
		System.out.println("endPlay Football");
	}

}
