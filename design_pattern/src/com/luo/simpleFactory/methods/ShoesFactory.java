package com.luo.simpleFactory.methods;

public class ShoesFactory {
	public Shoes getSlippers() {
		return new Slippers();
	}

	public Shoes getRunningShoes() {
		return new RunningShoes();
	}

	public Shoes getSandal() {
		return new Sandals();
	}
}
