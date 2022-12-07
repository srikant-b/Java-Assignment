package com.nissan.pojo;

public class Crow extends Animals {

	public Crow() {}
	
	public Crow(int noOfLegs, String colour) {
		super(noOfLegs, colour);
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Caw Caw";
	}

	@Override
	public double fly() {
		// TODO Auto-generated method stub
		return 4000;
	}

//	@Override
//	public void walk() {
//		// TODO Auto-generated method stub
//		System.out.println("Walking with " + super.getNoOfLegs() + " of legs");
//	}
}
