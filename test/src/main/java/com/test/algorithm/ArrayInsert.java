package com.test.algorithm;

public class ArrayInsert {
	private long[] a;
	private int numberElements;

	public ArrayInsert(int max) {
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

	// 插入排序算法
	public void insertSort() {
		int in, out;
		for (out = 1; out < numberElements; out++) {
			long temp = a[out];
			in = out;
			while (in > 0 && a[in - 1] >= temp) {
				a[in] = a[in - 1];
				--in;
			}
			a[in] = temp;
			// this.display();
			// System.out.println();
		}
	}

	private void swap(int one, int two) {
		long temp;
		temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
