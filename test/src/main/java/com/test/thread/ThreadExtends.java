package com.test.thread;
/**
 * 多线程实现方式一：继承类Thread
 * @author luoluo
 *
 */
public class ThreadExtends extends Thread {
	public void run() {
		System.out.println("run extends");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		ThreadExtends thread1 = new ThreadExtends();
		ThreadExtends thread2 = new ThreadExtends();
		thread1.start();
		thread2.start();
	}

}
