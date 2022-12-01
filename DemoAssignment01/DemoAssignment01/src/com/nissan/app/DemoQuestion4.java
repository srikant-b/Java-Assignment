package com.nissan.app;
import java.util.Scanner;
public class DemoQuestion4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the  kilometer Distance between two cities");
		double totalDistance=sc.nextDouble();
		double distanceInMeter=totalDistance*1000;
		System.out.println("distance in meter:" + distanceInMeter);

		double distanceInFoot=totalDistance*3280.84;
		System.out.println("distance in foot" + distanceInFoot );

		double distanceInInch=totalDistance*39370.1;
		System.out.println("Distance in inch" + distanceInInch);

		
	}

}
