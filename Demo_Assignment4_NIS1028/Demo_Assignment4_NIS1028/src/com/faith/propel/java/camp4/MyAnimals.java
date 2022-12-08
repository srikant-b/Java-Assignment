package com.faith.propel.java.camp4;

public class MyAnimals extends Animals implements IMammals {

	private int bodyTemp;
	
	public int getBodyTemp() {
		return bodyTemp;
	}

	public void setBodyTemp(int bodyTemp) {
		this.bodyTemp = bodyTemp;
	}

	@Override
	public int getBodyTemp(String temp) {
		return getBodyTemp();
	}

	@Override
	public void saySomething() {}

}
