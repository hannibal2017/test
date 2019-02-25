package com.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 与 Runnable 相比，Callable 可以有返回值，返回值通过 FutureTask 进行封装。
 * 
 * @author ThinkStation
 *
 */
public class MyCallableTest implements Callable<Integer> {
	public Integer call() {
		return 123;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallableTest mc = new MyCallableTest();
		FutureTask<Integer> ft = new FutureTask<>(mc);
		Thread thread = new Thread(ft);
		thread.start();
		System.out.println(ft.get());
	}

}
