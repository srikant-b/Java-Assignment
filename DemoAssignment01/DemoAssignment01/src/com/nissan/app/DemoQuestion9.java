package com.nissan.app;

import java.util.Arrays;import java.util.Scanner;

public class DemoQuestion9 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int []arr=new int[5];
		System.out.println("enter the 5 digit number");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("5 digit number is :");
		System.out.println(Arrays.toString(arr));
		System.out.println("the sum of its digits. " + sum);
		
		
		
		
		
	}

}
