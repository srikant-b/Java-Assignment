package com.nissan.pojo;

public class AccountType {

	private double interestRate;
	private double principleAmount;
	private float time;
	
	public AccountType() {}

	public AccountType(double interestRate, double principleAmount, float time) throws NumberFormatException {
		this.interestRate = interestRate;
		this.principleAmount = principleAmount;
		this.time = time;
	}
	
	public double getInterest() {
		return (principleAmount * interestRate * time) / 100;
	}
	
}
