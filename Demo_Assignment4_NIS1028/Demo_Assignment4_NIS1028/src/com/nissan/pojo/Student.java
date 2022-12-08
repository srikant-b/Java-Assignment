package com.nissan.pojo;

import com.nissan.exception.StudentCustomException;

public abstract class Student {
	private String name;
	private int id;
	private double grade;
	private byte age;
	private String address;

	// default constructor
	public Student() {}

	public Student(String name, int id, double grade, byte age, String address)
			throws NumberFormatException {
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.age = age;
		this.address = address;
	}

	// abstract isPassed method
	protected abstract boolean isPassed(double grade)
			throws StudentCustomException;

	@Override
	public String toString() {
		return "Student Details [Name: " + name + " | Student ID: " + id
				+ " | Grade: " + grade + " | Age: " + age + " | Address: "
				+ address + "]";
	}

}
