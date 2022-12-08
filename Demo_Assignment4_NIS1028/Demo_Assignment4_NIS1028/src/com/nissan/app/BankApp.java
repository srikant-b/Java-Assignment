package com.nissan.app;

import java.util.Scanner;

import com.nissan.pojo.A;
import com.nissan.pojo.B;
import com.nissan.pojo.Bank;
import com.nissan.pojo.C;

public class BankApp {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			boolean loop = true;
			Bank bank;
			while(loop) {
				System.out.println("Press 1 to know interest in A bank");
				System.out.println("Press 2 to know interest in B bank");
				System.out.println("Press 3 to know interest in C bank");
				System.out.println("Press 10 to exit");
				System.out.println("Select option: ");
				int choice = scan.nextInt();
				
				System.out.print("Enter your principle amount: ");
				double principleAmount = scan.nextDouble();
				System.out.print("Enter time period in years: ");
				double time = scan.nextDouble();
				
				switch (choice) {
				case 1:
					bank = new A(principleAmount, time);
					System.out.println("Your interest amount is " + bank.getInterest());
					break;

				case 2:
					bank = new B(principleAmount, time);
					System.out.println("Your interest amount is " + bank.getInterest());
					break;
					
				case 3:
					bank = new C(principleAmount, time);
					System.out.println("Your interest amount is " + bank.getInterest());
					break;
					
				case 10:
					loop = false;
					break;
					
				default:
					System.out.println("Not a valid choice");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
