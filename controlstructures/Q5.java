package com.nissan.controlstructures;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean loop = true;
			do {
				System.out.println("Welcome to Syntax Help Desk: ");
				System.out.println("Press 1 for help in if statement");
				System.out.println("Press 2 for help in switch statement");
				System.out.println("Press 3 for help in while loop");
				System.out.println("Press 4 for help in do-while loop");
				System.out.println("Press 5 for help in for loop");
				System.out.println("Press 10 to exit");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					ifStatementHelp();
					break;

				case 2:
					switchStatementHelp();
					break;

				case 3:
					whileLoopHelp();
					break;

				case 4:
					doWhileLoopHelp();
					break;

				case 5:
					forLoopHelp();
					break;

				case 10:
					loop = false;
					break;

				default:
					System.out.println("Not a valid choice");
					break;
				}
			} while (loop);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void ifStatementHelp() {
		System.out.println("if(condition is true) {");
		System.out.println("\t //statement;");
		System.out.println("} else {");
		System.out.println("\t //statement;");
		System.out.println("}");
	}

	static void switchStatementHelp() {
		System.out.println("switch(key) {");
		System.out.println("\t case1:");
		System.out.println("\t \t //statements");
		System.out.println("\t \t break;");
		System.out.println("\t default:");
		System.out.println("\t \t //statement");
		System.out.println("\t \t break;");
		System.out.println("}");
	}

	static void whileLoopHelp() {
		System.out.println("while(condition = true) {");
		System.out.println("\t //statement");
		System.out.println("}");
	}

	static void doWhileLoopHelp() {
		System.out.println("do {");
		System.out.println("\t //statement");
		System.out.println("} while(condition = true)");
	}

	static void forLoopHelp() {
		System.out
				.println("for(initialization; condition; increment/decrement) {");
		System.out.println("\t //statement");
		System.out.println("}");
	}

}
