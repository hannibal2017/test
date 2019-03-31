package com.luo.factoryMethod;

public class SlippersFactory implements Provider {

	@Override
	public Shoes produce() {
		return new Slippers();
	}

}
