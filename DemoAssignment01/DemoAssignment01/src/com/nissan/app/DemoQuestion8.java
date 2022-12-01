package com.nissan.app;

import java.util.Scanner;

public class DemoQuestion8 {
	public static void main(String[] args){
		try{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the one  number");
int i=sc.nextInt();
System.out.println("enter the other number");
int j=sc.nextInt();
System.out.println("the number before interchange");
System.out.println("i:" + i);
System.out.println("j:" +j);
System.out.println("the number after interchange");
i=i+j;
j=i-j;
int a=(i+j)/2;
int b=(i-j)/2;
System.out.println("i:" +a + " j :" + b);

}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
