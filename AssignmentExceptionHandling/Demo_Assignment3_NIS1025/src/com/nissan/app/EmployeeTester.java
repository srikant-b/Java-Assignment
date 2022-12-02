package com.nissan.app;

import java.util.Scanner;

import com.nissan.app.util.EmployeeAppUtil;

public class EmployeeTester {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Welcome to Emplyee Management System!!!");
			System.out.println("Enter your name: ");
			String empName = scan.nextLine();
			System.out.println("Enter the name of your organisation: ");
			String orgName = scan.nextLine();
			System.out.println("Enter your age: ");
			byte age = scan.nextByte();
			EmployeeAppUtil.addEmployee(empName, orgName, age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
