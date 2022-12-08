package com.nissan.app;

import java.util.Scanner;

import com.nissan.pojo.Cat;
import com.nissan.pojo.Chicken;
import com.nissan.pojo.Crow;
import com.nissan.pojo.Dogs;
import com.nissan.pojo.Goat;

public class AnimalTester {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			Cat cat = new Cat(4, "white");
			Dogs dog = new Dogs(4, "Brown");
			Crow crow = new Crow(2, "Black");
			Chicken chicken = new Chicken(2, "Brown");
			Goat goat = new Goat(4, "White");
			
			System.out.println("Cat says: " + cat.cry());
			System.out.println("Cat flies: " + cat.fly() + "m");
			cat.walk();
			
			System.out.println("Dog says: " + dog.cry());
			System.out.println("Dog flies: " + dog.fly() + "m");
			dog.walk();
			
			System.out.println("Goat says: " + goat.cry());
			System.out.println("Goat flies: " + goat.fly() + "m");
			goat.walk();
			
			System.out.println("Crow says: " + crow.cry());
			System.out.println("Crow flies: " + crow.fly() + "m");
			crow.walk();
			
			System.out.println("Chicken says: " + chicken.cry());
			System.out.println("Chicken flies: " + chicken.fly() + "m");
			chicken.walk();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
