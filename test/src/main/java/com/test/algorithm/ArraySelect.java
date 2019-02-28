package com.test.algorithm;

public class ArraySelect {
	private long[] a;
	private int numberElements;

	public ArraySelect(int max) {
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

	// 选择算法
	public void selectSort() {
		int first, second, min;
		for (first = 0; first < numberElements - 1; first++) {
			min = first;
			for (second = first + 1; second < numberElements; second++) {
				if (a[second] < a[min]) {
					min = second;
				}
			}
			swap(first, min);
		}
	}

	private void swap(int one, int two) {
		long temp;
		temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
