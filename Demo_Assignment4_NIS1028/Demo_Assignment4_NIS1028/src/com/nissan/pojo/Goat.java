package com.nissan.pojo;

public class Goat extends Animals {

	public Goat() {}
	
	public Goat(int noOfLegs, String colour) {
		super(noOfLegs, colour);
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Mehhhh";
	}

	@Override
	public double fly() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public void walk() {
//		// TODO Auto-generated method stub
//		System.out.println("Walking with " + super.getNoOfLegs() + " of legs");
//	}
}
