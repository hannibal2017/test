package com.test.design_patterns.template;

public class TemplateDemo {

	public static void main(String[] args) {
		Game game = new Basketball();
		game.play();
		game = new Football();
		game.play();
	}

}
