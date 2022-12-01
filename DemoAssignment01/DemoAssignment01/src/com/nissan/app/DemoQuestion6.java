package com.nissan.app;
import java.util.Scanner;
public class DemoQuestion6 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the one  number");
   int i=sc.nextInt();
   System.out.println("enter the other number");
   int j=sc.nextInt();
   System.out.println("the number before interchange");
   System.out.println("i:" + i);
   System.out.println("j:" +j);
   int temp;
   temp=i;
   i=j;
   j=temp;
   System.out.println("the number after interchange");
   System.out.println("i:" + i);
   System.out.println("j:" +j);
   

	
	}
}
