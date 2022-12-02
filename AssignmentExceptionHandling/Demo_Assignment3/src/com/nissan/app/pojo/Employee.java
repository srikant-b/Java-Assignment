package com.nissan.app.pojo;

public class Employee {
	private String empName;
	private String orgName;
	private byte empAge;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String orgName, byte empAge) {
		super();
		this.empName = empName;
		this.orgName = orgName;
		this.empAge = empAge;
	}

	public Employee(byte empAge) {
		super();
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empName: " + empName + " | orgName: " + orgName
				+ " | empAge: " + empAge + "]";
	}

}
