package com.test.thread;

public class ThreadForpools implements Runnable{
	private Integer index;

	public ThreadForpools(Integer index) {
		this.index = index;
	}

	public void run() {
//		System.out.println(index + ":开始处理线程！！！");
//			Thread.sleep(index);
//		System.out.println(index + ":我的线程标识是：" + this.toString());
		System.out.println(index);
		
	}
}
