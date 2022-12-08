package com.nissan.app;

import java.util.Scanner;

import com.nissan.pojo.AccountType;
import com.nissan.pojo.FixedDeposit;
import com.nissan.pojo.SavingsAccount;

public class AccountTypeTester {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			AccountType accountType;
			boolean loop = true;
			
			while(loop) {
				System.out.println("Press 1 for savings account type");
				System.out.println("Press 2 for fixed deposit type");
				System.out.println("Press 5 to exit");
				int choice = scan.nextInt();
				
				System.out.print("Enter principle amount: ");
				double principleAmount = scan.nextDouble();
				
				System.out.print("Enter time period: ");
				float time = scan.nextFloat();
				switch (choice) {
				case 1:
					accountType = new SavingsAccount(principleAmount, time);
					System.out.println("You interest will be: " + accountType.getInterest());
					break;
					
				case 2:
					accountType = new FixedDeposit(principleAmount, time);
					System.out.println("You interest will be: " + accountType.getInterest());
					break;
					
				case 5:
					loop = false;
					break;

				default:
					System.out.println("Not a valid choice");
					break;
				}
			}
		} catch (NumberFormatException e) {
			System.err.println("Inputs must be in numeric format");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
