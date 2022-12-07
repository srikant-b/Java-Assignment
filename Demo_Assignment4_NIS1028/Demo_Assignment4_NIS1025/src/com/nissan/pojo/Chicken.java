package com.nissan.pojo;

public class Chicken extends Animals {

	public Chicken() {}
	
	public Chicken(int noOfLegs, String colour) {
		super(noOfLegs, colour);
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Kuk-kudo-koo";
	}

	@Override
	public double fly() {
		// TODO Auto-generated method stub
		return 10;
	}

//	@Override
//	public void walk() {
//		// TODO Auto-generated method stub
//		System.out.println("Walking with " + super.getNoOfLegs() + " of legs");
//	}
}
