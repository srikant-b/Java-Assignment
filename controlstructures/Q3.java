package com.nissan.controlstructures;

import java.util.Scanner;

public class Q3 {
	/*
	 * Write a program that uses an if-else-if ladder to determine which season
	 * a particular Month is in. Months 1, 2 and 12 are come under winter
	 * season. Months 3, 4 and 5 are come under spring season. Months 6, 7 and 8
	 * are come under summer season. Months 9, 10 and 11 are come under autumn
	 * season. Accept a number for month from user and print the result
	 * accordingly.
	 */

	public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
	            // prompting user for entering the month
	            System.out.println("Enter the month in number: ");
	            byte monthNumber = sc.nextByte();



	           System.out.println(seasonType(monthNumber));
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	static String seasonType(byte monthNumber) {
		if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
			return "Winter Season!!!";
		} else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
			return "Spring Season!!!";
		} else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
			return "Summer Season!!!";
		} else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
			return "Autumn Season!!!";
		} else {
			return "It's not a valid month";
		}

	}

}
