package com.nissan.app;

import java.util.Scanner;

public class DemoQues3 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			// prompting user for numbers
			System.out.print("Enter the first number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter the second number: ");
			int num2 = sc.nextInt();
			
			System.out.print("The quotient is: " + num1 / num2 + '\n');
			System.out.print("The remainder is: " + num1 % num2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
