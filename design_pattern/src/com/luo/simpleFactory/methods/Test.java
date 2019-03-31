package com.luo.simpleFactory.methods;

public class Test {

	public static void main(String[] args) {
		ShoesFactory sf = new ShoesFactory();
		Shoes s1 = sf.getSlippers();
		Shoes s2 = sf.getRunningShoes();
		Shoes s3 = sf.getSandal();
		s1.wear();
		s2.wear();
		s3.wear();
	}

}
