package com.nissan.pojo;

public class FixedDeposit extends AccountType {

	public FixedDeposit(){}
	
	public FixedDeposit(double principleAmount, float time) {
		super(11, principleAmount, time);
	}
}
