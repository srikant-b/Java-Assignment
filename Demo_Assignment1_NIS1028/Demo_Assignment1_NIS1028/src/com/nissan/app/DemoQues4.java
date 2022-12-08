package com.nissan.app;

import java.util.Scanner;

public class DemoQues4 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			// prompting user to get the input
			System.out.print("Enter the distance in kms: ");
			double distance = sc.nextDouble();
			
			System.out.format("Distance in meters: %.2fm", kmsToMeter(distance));
			System.out.println();
			System.out.format("Distance in feet: %.2f'", kmsToFeet(distance));
			System.out.println();
			System.out.format("Distance in inches: %.2f\"", kmsToInches(distance));
			System.out.println();
			System.out.format("Distance in centimeters: %.2fcm", kmsToCms(distance));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// method to convert kilometers to meters
	static double kmsToMeter(double distance) {
		return distance * 1000;
	}
	
	// method to covert kilometers to feet
	static double kmsToFeet(double distance) {
		return distance * 3280.84;
	}
	
	// method to covert kilometers to inches
		static double kmsToInches(double distance) {
			return kmsToFeet(distance) * 12;
		}
		
		// method to covert kilometers to cms
		static double kmsToCms(double distance) {
			return kmsToMeter(distance) * 100;
		}
}
