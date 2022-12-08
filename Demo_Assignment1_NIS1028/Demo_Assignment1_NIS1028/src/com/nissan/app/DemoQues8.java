package com.nissan.app;

import java.util.Scanner;

public class DemoQues8 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// prompting user for inputs
			System.out.println("Enter first number: ");
			int num1 = sc.nextInt();
			System.out.println("Enter second number: ");
			int num2 = sc.nextInt();
			
			System.out.println("Before swapping:");
			System.out.println("num1: " + num1 + " | num2: " + num2);
			num1 += num2;
			num2 = num1 - num2;
			num1 -= num2;
			
			System.out.println("After swapping:");
			System.out.println("num1: " + num1 + " | num2: " + num2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
