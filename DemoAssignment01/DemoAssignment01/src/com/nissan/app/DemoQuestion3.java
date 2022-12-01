package com.nissan.app;
import java.util.Scanner;
public class DemoQuestion3 {
	public static void main(String[] args){
	try{Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	double firstName=sc.nextDouble();
	System.out.println("enter the  second  number");
	double secondNumber=sc.nextDouble();
	System.out.println("remainder:after division");
	double remainder=(firstName%secondNumber);
	System.out.println("quotient:after division");
	double quotient=(firstName/secondNumber);
	}
catch(Exception e)
{
	e.printStackTrace();
}
}
}
