package com.test.thread;
/**
 * 多线程实现方式二：实现接口Runnable
 * @author luoluo
 *
 */
public class ThreadRunnable implements Runnable {
	public void run() {
		System.out.println("implements runnable");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread() + ":" + i);
		}
	}

	public static void main(String[] args) {
		ThreadRunnable threadRunnable = new ThreadRunnable();
		Thread thread1 = new Thread(threadRunnable);
		Thread thread2 = new Thread(threadRunnable);
		thread1.start();
		thread2.start();
	}

}
