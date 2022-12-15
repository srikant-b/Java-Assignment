package com.nissan.lib;

import java.util.Random;

public class Customer {
	public String numbers = "0123456789";
	public int minBalance=1000;
	
	private char[] accountNo=new char[9]; //– (AutoGenerate 9 digits)
	private String customerName;
	private String accountType; //(Savings/Current)
	private int balance;
	private long phoneNumber;
	private String emailId;
	private char[] atmPin=new char[4];//(Autogenerate 4 digits)
	//parameterized constructor
	public Customer(String customerName,String accountType,int balance,long phoneNumber
			,String emailId)
	{
		this.customerName=customerName;
		this.accountType=accountType;
		this.balance=balance;
		this.phoneNumber=phoneNumber;
		this.emailId=emailId;
		this.accountNo=generateAccountNumber();
		this.atmPin=generateOtp();
	}
	//default constructor
	public Customer()
	{
		
	}
	public  void updateDetails(long phoneNo,String emailId)
	{
		this.emailId=emailId;
		this.phoneNumber=phoneNo;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	public  void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public  String getEmilId() {
		return this.emailId;
	}
	public  void setEmilId(String emilId) {
		this.emailId = emilId;
	}
	public  String getAccountNo() {
		String num="";
		for(char i:this.accountNo)
		{
			num+=i;
		}
		return num;
	}
	public String getAtmPin()
	{
		String otp="";
		for(char i:this.atmPin)
		{
			otp+=i;
		}
		return otp;
	}
	public  char[] generateOtp()
	{
		Random rndm_method = new Random();
		  
        char[] otp = new char[4];
  
        for (int i = 0; i < 4; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            otp[i] =
             numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return otp;
	}
	public char[] generateAccountNumber()
	{
		Random rndm_method = new Random();
		  
        char[] accNo = new char[9];
  
        for (int i = 0; i < 9; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
        	accNo[i] =
             numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return accNo;
	}
}
