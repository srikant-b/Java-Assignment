package com.nissan.app;

import java.util.Scanner;

public class DemoQues10 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// prompting user for input
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
			
			System.out.print("Reverse of " + num + " is: " + reverseNumber(num));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// method to reverse number
	static int reverseNumber(int num) {
		if(num < 10) {
			return num;
		} else {
			int reverseNum = 0;
			int remainder;
			int temp = num;
			
			while(temp > 0) {
				remainder = temp % 10;
				temp /= 10;
				reverseNum = reverseNum * 10 + remainder;
			}
			return reverseNum;
		}	
	}
}
