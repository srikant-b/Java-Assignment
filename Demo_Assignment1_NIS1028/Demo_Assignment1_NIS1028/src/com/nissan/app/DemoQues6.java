package com.nissan.app;

import java.util.Scanner;

public class DemoQues6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// prompting user for inputs
			System.out.print("Enter the value of i: ");
			int i = sc.nextInt();
			System.out.print("Enter the value of j: ");
			int j = sc.nextInt();

			System.out.println("Before swapping: ");
			System.out.println("i: " + i + " | j: " + j);

			System.out.println("After swapping");
			swapTwoNumbers(i, j);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// method to swap number
	static void swapTwoNumbers(int i, int j) {
		int temp;
		temp = i;
		i = j;
		j = temp;
		
		System.out.println("i: " + i + " | j: " + j);
	}
}
