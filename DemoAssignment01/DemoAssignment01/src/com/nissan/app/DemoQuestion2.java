package com.nissan.app;
import java.util.Scanner;
public class DemoQuestion2 {
	public static void main(String[] args)
	{
		//He bought notebooks for 
		//Rs.100 and magic pot for Rs.50. 
		try{Scanner sc=new Scanner(System.in);
		System.out.println("enter the price of otebook:");
		int priceOfNotebook=sc.nextInt();
		System.out.println("enter the price of Magicpot:");

		int priceOfMagicpot=sc.nextInt();
		
		int totalAmount=(priceOfNotebook+priceOfMagicpot);
		
		System.out.println("The total Amount of the product:" + totalAmount);
	}catch(Exception e)
	{e.printStackTrace();}
	}

}
