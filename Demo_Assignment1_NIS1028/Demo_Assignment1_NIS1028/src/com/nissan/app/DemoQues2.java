package com.nissan.app;

import java.util.Scanner;

public class DemoQues2 {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number of items Ramu brought: ");
			int items = sc.nextInt();
			
			// Creating an array of items
			int[] priceArray = new int[items];
			System.out.println("Enter the prices: ");
			
			// prompting user to get prices
			for(int i = 0; i < items; i++) {
				priceArray[i] = sc.nextInt();
			}
			
			// getting total price by passing the array to a function
			double totalPrice = getTotalPrice(priceArray);
			 
			System.out.format("Ramu has spent a total amount of: %.2f", totalPrice);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// method to get total price
	static double getTotalPrice(int[] arr) {
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		// returning sum value
		return sum;
	}
}
