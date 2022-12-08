package com.nissan.app;

import static com.nissan.util.PhoneBookUtil.checkDuplicateNumber;
import static com.nissan.util.PhoneBookUtil.getPhoneBookList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in);
				BufferedReader brRead = new BufferedReader(new InputStreamReader(System.in))) {

			List<String> phoneBookList = getPhoneBookList();
			
			boolean loop = true;
			
			while(loop) {
				System.out.println("Press 1 to enter new number");
				System.out.println("Press 2 to view all the phone nos.");
				System.out.println("Press 5 to exit");
				System.out.println("Enter your choice: ");
				int choice = scan.nextInt();
				
				switch (choice) {
				case 1:
					System.out.println("Enter the number");
					String newNumber = brRead.readLine();
					checkDuplicateNumber(newNumber, phoneBookList);
					phoneBookList.add(newNumber);
					break;

					case 2:
						for (String string : phoneBookList) {
							System.out.println(string);
						}
						break;
					
					case 5:
						loop = false;
						break;
						
				default:
					System.out.println("Not a valid choice!!!");
					break;
				}
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
