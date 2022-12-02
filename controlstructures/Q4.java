package com.nissan.controlstructures;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// input for the month
			System.out.println("Enter the month in number: ");
			byte monthNumber = sc.nextByte();

			System.out.println(seasonType(monthNumber));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static String seasonType(byte monthNumber) {
		switch (monthNumber) {
		case 1:
		case 2:
		case 12:
			return "Winter Season!!!";
		case 3:
		case 4:
		case 5:
			return "Spring Season!!!";
		case 6:
		case 7:
		case 8:
			return "Summer Season!!!";
		case 9:
		case 10:
		case 11:
			return "Autumn Season!!!";
		default:
			return "It's not a valid month";
		}
	}

}
