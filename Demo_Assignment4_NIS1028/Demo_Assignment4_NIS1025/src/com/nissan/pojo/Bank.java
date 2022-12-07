package com.nissan.pojo;

public abstract class Bank {

	private double principleAmount;
	private double time;
	private double interestRate;
	
	public Bank() {}
	
	public Bank(double principleAmount, double time) {
		this.principleAmount = principleAmount;
		this.time = time;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getPrincipleAmount() {
		return principleAmount;
	}

	public double getTime() {
		return time;
	}

	public abstract double getInterest();

}
