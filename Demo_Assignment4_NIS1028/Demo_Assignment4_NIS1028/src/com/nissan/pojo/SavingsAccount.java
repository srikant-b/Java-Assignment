package com.nissan.pojo;

public class SavingsAccount extends AccountType {
	
	public SavingsAccount() {	}
	
	public SavingsAccount(double principleAmount, float time) {
		super(4, principleAmount, time);
	}
}
