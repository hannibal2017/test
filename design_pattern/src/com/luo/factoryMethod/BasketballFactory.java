package com.luo.factoryMethod;

public class BasketballFactory implements Provider {

	@Override
	public Shoes produce() {
		return new BasketballShoes();
	}

}
