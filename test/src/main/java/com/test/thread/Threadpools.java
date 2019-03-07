package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 多线程实现方式三：Executors
 * 查看网址 https://www.cnblogs.com/ljp-sun/p/6580147.html
 */		
public class Threadpools {
	/**
	 * 我们获取四次次线程，观察4个线程地址
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		System.out.println("****************************newCachedThreadPool*******************************");
		for (int i = 0; i < 20; i++) {
			final int index = i;
			newCachedThreadPool.execute(new ThreadForpools(index));
		}
		newCachedThreadPool.shutdown();
		*/
		
		//newSingleThreadExecutor 确保线程顺序执行
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		System.out.println("****************************newSingleThreadExecutor*******************************");
		for (int i = 0; i < 20; i++) {
			final int index = i;
			newSingleThreadExecutor.execute(new ThreadForpools(index));
		}
		newSingleThreadExecutor.shutdown();
	}
}
