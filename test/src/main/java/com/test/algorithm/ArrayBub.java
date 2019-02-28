package com.test.algorithm;

public class ArrayBub {
	private long[] a;
	private int numberElements;

	public ArrayBub(int max) {
		a = new long[max];
		numberElements = 0;
	}

	public void insert(long value) {
		a[numberElements] = value;
		numberElements++;
	}

	public void display() {
		for (int i = 0; i < numberElements; i++) {
			System.out.print(a[i]);
			System.out.print("  ");
		}
	}

	// 冒泡算法
	public void bubbleSort() {
		int outer, in;
		for (outer = numberElements - 1; outer > 1; outer--) {
			for (in = 0; in < outer; in++) {
				if (a[in] > a[in + 1]) {
					swap(in, in + 1);
				}
			}
		}
	}

	private void swap(int one, int two) {
		long temp;
		temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
