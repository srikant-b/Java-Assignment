package com.nissan.assignment01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		
		/*10. If a five-digit number is given, write a program to reverse the number.
You can set the status of your assignment here.
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. : ");
		int n = sc.nextInt();
		Rev(n);
	
		sc.close();	
	}
	private static void Rev(int n){
		if(n>0&&n<10){
			System.out.println(n);
		}
		else if(n<0){
			System.out.print(n%10);
			Rev(n/10);
		}
		else{
			System.out.print(n%10);
			Rev(n/10);	
		}
	}
}
