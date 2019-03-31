package com.luo.simpleFactory.basic;

public class ShoesFactory {
	public Shoes getFactory(String type) {
		if ("Slippers".equals(type)) {
			return new Slippers();
		} else if ("Sandals".equals(type)) {
			return new Sandals();
		} else if ("RunningShoes".equals(type)) {
			return new RunningShoes();
		} else {
			System.out.println("error:input correct type");
			return null;
		}
	}
}
