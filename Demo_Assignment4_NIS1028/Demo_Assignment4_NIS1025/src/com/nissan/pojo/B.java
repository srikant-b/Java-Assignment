package com.nissan.pojo;

public class B extends Bank {

	public B() {}
	
	public B(double principleAmount, double time) {
		super(principleAmount, time);
		super.setInterestRate(9);
	}
	
	@Override
	public double getInterest() {
		return super.getPrincipleAmount() * super.getInterestRate() * super.getTime() / 100;
	}

}
