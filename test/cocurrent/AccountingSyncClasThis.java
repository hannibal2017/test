package com.test.cocurrent;

public class AccountingSyncClasThis implements Runnable {
	static AccountingSyncClasThis instance = new AccountingSyncClasThis();
	static int i = 0;

	public void run() {
		// 省略其他耗时操作....
		//1, 使用同步代码块对变量i进行同步操作,锁对象为instance
		synchronized (instance) {
			for (int j = 0; j < 1000000; j++) {
				i++;
			}
		}
		//2,//this,当前实例对象锁
//		synchronized (instance) {
//			for (int j = 0; j < 2000000; j++) {
//				i++;
//			}
//		}
		//3,class对象锁
//		synchronized (AccountingSyncClasThis.class) {
//			for (int j = 0; j < 3000000; j++) {
//				i++;
//			}
//		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(instance);
		Thread t2 = new Thread(instance);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(i);
	}
}
