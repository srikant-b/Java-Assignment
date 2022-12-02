package com.nissan.controlstructures;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		String[] month = {"jan","feb","mar","apr","may","jun","july","aug","sep","oct","nov","dec"}; 
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the month no.");
		int monthInNumber = sc.nextInt();
		
		System.out.println("entered month is assigned for : "+month[monthInNumber-1]);
		sc.close();
	}

}
