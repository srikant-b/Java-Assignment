package com.nissan.controlstructures;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the real constant: ");
			final double REAL_CONST = sc.nextDouble();

			System.out.println((int) REAL_CONST);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
