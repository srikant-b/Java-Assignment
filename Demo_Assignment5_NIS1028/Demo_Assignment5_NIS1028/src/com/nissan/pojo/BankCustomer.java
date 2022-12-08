package com.nissan.pojo;

public class BankCustomer {

	private String customerName;
	private String accountNumber;
	private double balance;
	private String panNumber;

	public BankCustomer() {
	}

	// constructor with Account Number
	public BankCustomer(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	// overloaded constructor - All parameters
	public BankCustomer(String customerName, String accountNumber,
			double balance, String panNumber) {
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.panNumber = panNumber;
	}

	// Setters & Getters
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber.toUpperCase();
	}

	public boolean equals(Object obj) {
		if(obj instanceof BankCustomer) {
			BankCustomer customer = (BankCustomer)obj;
			return customer.accountNumber.equals(accountNumber);
		}
		return false;
	}

	@Override
	public String toString() {
		return "BankCustomer [customerName=" + customerName
				+ ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", panNumber=" + panNumber + "]";
	}

}
