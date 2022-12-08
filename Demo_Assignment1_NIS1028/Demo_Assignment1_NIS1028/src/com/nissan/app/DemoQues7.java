package com.nissan.app;

import java.util.Scanner;

public class DemoQues7 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			// prompting user for input
			System.out.print("Enter Raju's basic salary: ");
			double basic = sc.nextDouble();
			
			calculateSalary(basic);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// method to calculate salary 
	static void calculateSalary(double basic) {
		System.out.format("Raju's salary is: %.2f", (1.6 * basic)); 
	}
}
