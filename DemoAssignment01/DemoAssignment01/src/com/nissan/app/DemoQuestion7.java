package com.nissan.app;
import java.util.Scanner;
public class DemoQuestion7 {
	public static void main(String[] args){
	try{	Scanner sc=new Scanner(System.in);
		System.out.println("enter the basic salary");
		   double basicSalary=sc.nextInt();
		   
		   double dearness=basicSalary*.4;
		   double houseRent=basicSalary*.2;
		 double  totalSalary=basicSalary+dearness+houseRent;
		   System.out.println("Basic salary:" + basicSalary);
		   System.out.println("Dearness:" + dearness);
		   System.out.println("House Rent:" + houseRent);
		   System.out.println("Total Salary:" + totalSalary);
	}catch(Exception e)
	{e.printStackTrace();}
	}

}
