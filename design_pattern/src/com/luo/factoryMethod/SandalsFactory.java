package com.luo.factoryMethod;

public class SandalsFactory implements Provider {

	@Override
	public  Shoes produce() {
		return new Sandals();
	}

}
