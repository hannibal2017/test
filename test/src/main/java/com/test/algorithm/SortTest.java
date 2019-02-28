package com.test.algorithm;
/**
 * 几种排序算法的时间测试
 * @author luoluo
 *
 */
public class SortTest {
	public static void main(String[] args) {
		int initial = 100000;
		ArrayBub arrayBub = new ArrayBub(initial);
		ArraySelect arraySelect = new ArraySelect(initial);
		ArrayInsert arrayInsert = new ArrayInsert(initial);
		for (int i = 0; i < initial; i++) {
			arrayBub.insert((int) (Math.random() * 100));
			arraySelect.insert((int) (Math.random() * 100));
			arrayInsert.insert((int) (Math.random() * 100));
		}
		long start = System.currentTimeMillis();
		arrayBub.bubbleSort();
		long end = System.currentTimeMillis();
		System.out.println("bubble :" + (end - start) + "ms");

		start = System.currentTimeMillis();
		arraySelect.selectSort();
		end = System.currentTimeMillis();
		System.out.println("select:" + (end - start) + "ms");

		start = System.currentTimeMillis();
		arrayInsert.insertSort();
		end = System.currentTimeMillis();
		System.out.println("insert:" + (end - start) + "ms");
	}
}
