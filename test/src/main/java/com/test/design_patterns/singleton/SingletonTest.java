package com.test.design_patterns.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getUniqueInstance();
		Singleton s2 = Singleton.getUniqueInstance();
		System.out.println(s1 == s2);
	}

}
