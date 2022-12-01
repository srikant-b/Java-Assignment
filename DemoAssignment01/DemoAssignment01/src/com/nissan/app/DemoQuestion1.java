package com.nissan.app;
import java.util.Scanner;
public class DemoQuestion1 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of orange");
		int numberOfOrange = sc.nextInt();
		System.out.println("enter the total price of an orange");
		int totalPrice=sc.nextInt();
		float priceOfOrange;
		priceOfOrange=(totalPrice/numberOfOrange);
		System.out.println("the price of 1 orange is:" + priceOfOrange);
		
		
		
		
	}

}
