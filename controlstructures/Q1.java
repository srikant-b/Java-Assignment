package com.nissan.controlstructures;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		/*
		 * Consider an electricity billing calculation. There are two types of
		 * customers. Domestic and Industry. If it is domestic, the slabs are
		 * like this, The reading in the range,0-100 then amt=units* Rs.1
		 * 
		 * 100-200amt=units*1.5
		 * 
		 * 200-500amt=units*2
		 * 
		 * >500amt = units*5
		 * 
		 * If it is industrial, the amt =units*10.
		 */

		double bill;
		double units;
		double pricePerUnit;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("choose option 1 for industry option 2 for individual : ");
		int a=sc.nextInt();
		String type;
		
		switch(a){
		
		case(1):
			System.out.println("enter total units : ");
			units=sc.nextDouble();
			pricePerUnit = 10;
			bill = units*pricePerUnit;
			System.out.println("electricity bill = "+bill);
		
			break;
			
		case(2):
			System.out.println("enter total units : ");
			units=sc.nextDouble();

			if (units<=100){
				pricePerUnit = 1;
				bill = units*pricePerUnit;
			}
			else if(units>100 && units<=200){
				pricePerUnit = 1.5;
				bill = (units-100)*pricePerUnit + 100;
			}
			else if(units>200 && units<=500){
				pricePerUnit = 2;
				bill = (units-200)*pricePerUnit + 250;
			}
			else{
				pricePerUnit = 5;
				bill = (units-500)*pricePerUnit + 850;
			}
			
			System.out.println("electricity bill is: "+ bill);
		
		
		}
	}

}
