package com.test.design_patterns.template;

public class Basketball extends Game {

	@Override
	void initial() {
		System.out.println("initial basketball");
	}

	@Override
	void startPlay() {
		System.out.println("startPlay basketball");
	}

	@Override
	void endPlay() {
		System.out.println("endPlay basketball");
	}

}
