package com.nissan.app;

import java.util.Scanner;

public class DemoQuestion5 {

	public static void main(String [] args)
	{try{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature in Farenheit");
		double temperatureFaren= sc.nextDouble();
		double temperatureCelcius=((temperatureFaren-32)*5)/9;
		System.out.println("The temperature in Celcius" +  temperatureCelcius);
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
}
