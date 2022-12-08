package com.nissan.app;

import java.util.Scanner;

public class DemoQues9 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			//prompting user for input
			System.out.print("Enter the 5-digit number: ");
			int number = sc.nextInt();
			
			System.out.println("The sum of digits is: " + sumOfDigit(number));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// method to calculate sum of digit 
	static int sumOfDigit(int num) {
		int sum = 0;
		int temp = num;
		int remainder;
		
		while(temp > 0) {
			remainder = temp % 10;
			temp /= 10;
			sum += remainder;
		}
		return sum;
	}
}
