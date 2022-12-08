package com.nissan.app;

import java.util.Scanner;

import static com.nissan.util.CalculatorUtil.*;

public class CalculatorAppTester {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			
			// accepting 2 values as int
			System.out.print("Enter the first value: ");
			int intNum1 = scan.nextInt();
			System.out.print("Enter the second value: ");
			int intNum2 = scan.nextInt();
			
			// accepting 2 values as float
			System.out.print("Enter the first value: ");
			float floatNum1 = scan.nextFloat();
			System.out.print("Enter the second value: ");
			float floatNum2 = scan.nextFloat();
			
			System.out.println("Output of 2 intergers is: " + sum(intNum1, intNum2));
			System.out.println("Output of 2 floats is: " + sum(floatNum1, floatNum2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
