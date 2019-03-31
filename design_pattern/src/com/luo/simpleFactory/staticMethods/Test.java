package com.luo.simpleFactory.staticMethods;

public class Test {

	public static void main(String[] args) {
		Shoes s1 = ShoesFactory.getSlippersFactory();
		Shoes s2 = ShoesFactory.getRunningShoesFactory();
		Shoes s3 = ShoesFactory.getSandalsFactory();
		s1.wear();
		s2.wear();
		s3.wear();
	}

}
