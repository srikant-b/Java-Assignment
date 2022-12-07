package com.nissan.pojo;

import com.nissan.exception.StudentCustomException;

public class UnderGrad extends Student {

	public UnderGrad(String name, int id, double grade, byte age, String address) {
		super(name, id, grade, age, address);
	}

	public boolean isPassed(double grade) throws StudentCustomException {
		if (grade > 100 || grade < 0) {
			throw new StudentCustomException(
					"Grade can't be greater than 100 or less than 0");
		} else if (grade < 70) {
			return false;
		} else {
			return true;
		}

	}

}
