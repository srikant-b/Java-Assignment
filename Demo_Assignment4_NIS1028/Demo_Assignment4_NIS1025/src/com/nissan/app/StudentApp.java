package com.nissan.app;

import java.util.Scanner;

import com.nissan.pojo.Grad;
import com.nissan.pojo.UnderGrad;

public class StudentApp {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			boolean loop = true;
			while(loop) {
				System.out.println("Press 1 to enter Graduate Student details");
				System.out.println("Press 2 to enter Under Graduate Student details");
				System.out.println("Press 10 to exit");
				int choice = scan.nextInt();
				
				System.out.println("Enter the Student details: ");
				System.out.print("Enter Student name: ");
				scan.nextLine();
				String name = scan.nextLine();
				System.out.print("Enter Student ID: ");
				int id = scan.nextInt();
				System.out.print("Enter grade: ");
				double grade = scan.nextDouble();
				System.out.print("Enter age: ");
				byte age = scan.nextByte();
				scan.nextLine();
				System.out.println("Enter Address: ");
				String address = scan.nextLine();
				
				switch (choice) {
				case 1:
					Grad gradStudent = new Grad(name, id, grade, age, address);
					System.out.println("The Graduate student details are: ");
					System.out.println(gradStudent.toString() + " | isPassed: " + gradStudent.isPassed(grade));
					break;

				case 2:
					UnderGrad underGradStudent = new UnderGrad(name, id, grade, age, address);
					System.out.println("The Graduate student details are: ");
					System.out.println(underGradStudent.toString() + " | isPassed: " + underGradStudent.isPassed(grade));
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
			System.err.println(e.getMessage());
		}
	}
}
