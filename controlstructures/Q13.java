package com.nissan.controlstructures;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the year: ");
			int year = sc.nextInt();

			System.out.println("Enter the month number: ");
			int monthNum = sc.nextInt();

			if (isLeapYear(year)) {
				if (monthNum == 2) {
					System.out.println("Month " + findMonth(monthNum) + " has "
							+ (findDaysInMonth(monthNum) + 1) + " days.");
				}
			} else {
				System.out.println("Month " + findMonth(monthNum) + " has "
						+ findDaysInMonth(monthNum) + " days.");
			}
		}
	}

	// method to find if it's a leap year
	static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 == 0) {
				return true;
			} else if (year % 100 == 0 && year % 400 != 0) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	// finding month name
	static String findMonth(int monthNum) {
		String[] month = { "", "January", "February", "March", "April", "May",
				"June", "July", "August", "Spetember", "October", "November",
				"December" };
		return month[monthNum];
	}

	static int findDaysInMonth(int monthNum) {
		int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return daysInMonth[monthNum];
	}

}
