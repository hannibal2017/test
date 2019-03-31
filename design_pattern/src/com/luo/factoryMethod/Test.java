package com.luo.factoryMethod;

public class Test {

	public static void main(String[] args) {
		Provider p1 = new SlippersFactory();
		Shoes s = p1.produce();
		s.wear();
		Provider p2 = new RunningShoesFactory();
		s = p2.produce();
		s.wear();
		Provider p3 = new SandalsFactory();
		s = p3.produce();
		s.wear();

		/**
		 * new a new shoes:basketball 
		 * accord with OPEN AND CLOSE PRICIPLE
		 * 1,create a new class: BasketballShoes
		 * 2,create new factory:basketballFactory
		 */
		Provider p4 = new BasketballFactory();
		s = p4.produce();
		s.wear();
		

	}

}
