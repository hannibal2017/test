package com.test.basicJava;

import java.util.Arrays;

public class StaticTest {
	static {
		System.out.println("static block");
	}

	public static void staticMethod() {
		System.out.println("static method test");
	}

	public static void main(String[] args) {
		// StaticTest test = new StaticTest();
		StaticTest.staticMethod();
		int[] a = {3,1,78,13};
		for (int i = 0; i < a.length;i++){
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length;i++){
			System.out.println(a[i]);
		}
	}
}
