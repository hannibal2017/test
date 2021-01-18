package com.test.thread;

/**
 * @author edz
 * @version V1.0
 * @Package com.test.thread
 * @date 2020-10-23 23:02
 */
public class ThreadTask implements Runnable {

    public ThreadTask() {

    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}