package com.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * �� Runnable ��ȣ�Callable �����з���ֵ������ֵͨ�� FutureTask ���з�װ��
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
