package com.nissan.controlstructures;

import java.util.Scanner;

public class Q2 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		        int actualPin = 1234;
		        checkPin(actualPin);
		    }
		    private static void checkPin(int actualPin) {
		        System.out.print("Please enter PIN :");
		        int inputPin = input.nextInt();
		        try {
		            if(actualPin  == inputPin) System.out.println("You are welcome.. ");
		            else System.out.println("Please enter valid Pin not :" + inputPin);
		        }
		        catch(Exception e) {
		            System.out.println("Please enter valid Numbe: "+ e);
		        }
		
	}

}
