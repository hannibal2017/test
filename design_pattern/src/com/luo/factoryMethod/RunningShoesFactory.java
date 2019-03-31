package com.luo.factoryMethod;

public class RunningShoesFactory implements Provider {

	@Override
	public Shoes produce() {
		return new RunningShoes();
	}

}
