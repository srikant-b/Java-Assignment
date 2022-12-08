package com.nissan.app;

import java.util.Scanner;

public class DemoQues1 {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			// taking inputs from the user
			// input - Total no. of oranges
			System.out.print("Enter the number of oranges: ");
			int orangeCount = sc.nextInt();
			
			// input - Total price
			System.out.print("Enter total price: ");
			float totalAmount = sc.nextFloat();
			
			System.out.print("The unit price of orange is: " + totalAmount / orangeCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
