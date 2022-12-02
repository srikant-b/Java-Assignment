package com.nissan.app;

import java.util.Scanner;

public class ArrayTester {
	public static void main(String[] args) throws IndexOutOfBoundsException {
		try (Scanner scan = new Scanner(System.in)) {
			int[] numArr = new int[10];

			for (int i = 0; i < 11; i++) {
				numArr[i] = i;
				System.out.println(numArr[i]);
			}
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException(
					"The array size is 10, don't go beyond that value");
		} // catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
	}
}
