package com.luo.simpleFactory.basic;

public class Test {

	public static void main(String[] args) {
		ShoesFactory sf = new ShoesFactory();
		Shoes s1 = sf.getFactory("Slippers");
		Shoes s2 = sf.getFactory("Sandals");
		Shoes s3 = sf.getFactory("RunningShoes");
		s1.wear();
		s2.wear();
		s3.wear();
	}

}
