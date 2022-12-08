package com.nissan.app;

import java.util.Scanner;

public class DemoQues5 {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			// prompting user to get input in Fahrenheit
			System.out.print("Enter the temperature in Fahrenheit: ");
			float tempFahrenheit = sc.nextFloat();
			
			// output
			System.out.format("Temperature in Celcius: %.2f°C", fahrenheitToCelcius(tempFahrenheit));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// method to covert Fahrenheit to Celcius
	static float fahrenheitToCelcius(float temperature) {
		return ((temperature - 32) * 5) / 9;
	}
}
