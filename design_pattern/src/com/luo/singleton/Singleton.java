package com.luo.singleton;
/**
 * 基本实现方式，不适用于多线程方式
 * @author luoluo
 *
 */
public class Singleton {
	public static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
