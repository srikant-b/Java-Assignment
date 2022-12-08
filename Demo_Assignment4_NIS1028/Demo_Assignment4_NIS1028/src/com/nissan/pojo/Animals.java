package com.nissan.pojo;

public abstract class Animals {

	private int noOfLegs;
	private String color;
	
	public Animals() {}

	public Animals(int noOfLegs, String color) {
		this.noOfLegs = noOfLegs;
		this.color = color;
	}
	
	public abstract String cry();
	
	public abstract double fly();
	
	public void walk() {
		System.out.println("Walking with " + this.noOfLegs+ " of legs");
	};

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public String getColor() {
		return color;
	}
	
}
