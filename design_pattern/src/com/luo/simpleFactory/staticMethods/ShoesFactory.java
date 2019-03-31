package com.luo.simpleFactory.staticMethods;

public class ShoesFactory {
	public static Shoes getSlippersFactory() {
		return new Slippers();
	}

	public static Shoes getRunningShoesFactory() {
		return new RunningShoes();
	}

	public static Shoes getSandalsFactory() {
		return new Sandals();
	}
}
