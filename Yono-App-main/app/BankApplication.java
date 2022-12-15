package com.nissan.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.nissan.lib.Customer;

public class BankApplication {
	public static ArrayList<Customer> customerList=new ArrayList<Customer>();
	public static Scanner input=new Scanner(System.in);
	public static Scanner scanner=new Scanner(System.in);
	public static int tranferedAmount;
	public static void main(String[] args)
	{
		char choice='n';
		do
		{
			try
			{
				System.out.println("Hello There!!!");
				System.out.println("Please select option from below: \n1.Add Customer \n2.Update Cutomer details"
						+ "\n3.Delete Customer \n4.Deposit Money \n5.Withdraw money \n6.Show Balance"
						+ "\n7.List all Customers \n8.Tranfer money to another account");
				int option=scanner.nextInt();
				switch(option)
				{
				case 1:
					addCustomer();
					break;
				case 2:
					updateDetails();
					break;
				case 3:
					deleteCustomer();
					break;
				case 4:
					depositMoney();
					break;
				case 5:
					withdrawMoney();
					break;
				case 6:
					showBalance();
					break;
				case 7:
					listAllCustomers();
					break;
				case 8:
					transferToAnother();
					break;
				default:
					System.out.println("Invalid option selected");
				}
				System.out.println("Want to enter more? (y/n)");
				choice=input.nextLine().charAt(0);
			}
			catch(Exception e)
			{
				System.out.println("Invalid Input...");
			}
		}
		while(choice=='y'||choice=='Y');
	}
	private static void displayCustomer() {
		try
		{
			System.out.println("Enter account Number to transfer: ");
			String accNo=input.nextLine();
			System.out.format("%15s%15s%15s%15s%15s%15s%15s%n","Acc Number","Customer Name","Acc Type","Balance","Phone No","Email Id","ATM Pin");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
			boolean found=false;
			for(Customer customer:customerList)
			{
				if(customer.getAccountNo()==accNo)
				{
					found=true;
					System.out.format("%15s%15s%15s%15s%20s%20s%15s%n",customer.getAccountNo(),customer.getCustomerName(),customer.getAccountType(),customer.getBalance(),customer.getPhoneNumber(),customer.getEmilId(),customer.getAtmPin());
				}
				
			}
			if(!found)
			{
				System.out.println("Accound not found..");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input....");
		}
		
	}
	private static void transferToAnother() {
		try
		{	
			
			System.out.println("Enter your acc number: ");
			String acc=input.nextLine();
			System.out.println("Enter account Number to transfer: ");
			String accNo=input.nextLine();
			System.out.println("Enter amount to transfer: ");
			int amount=scanner.nextInt();
			boolean found=false;
			for(Customer customer:customerList)
			{
				if(customer.getAccountNo().equals(accNo))
				{
					
					for(Customer customer2:customerList)
					{
						if(customer2.getAccountNo().equals(acc))
						{
							found=true;
							customer.setBalance(customer.getBalance()-amount);
							customer2.setBalance(customer2.getBalance()+amount);
						}
					}
				}	
			}
			if(!found)
			{
				System.out.println("Account number doesn't exists");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input....");
		}
		
	}
	private static void listAllCustomers() {
		try
		{
			System.out.format("%15s%15s%15s%15s%15s%15s%15s%n","Acc Number","Customer Name","Acc Type","Balance","Phone No","Email Id","ATM Pin");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
			for(Customer customer:customerList)
			{
				System.out.format("%15s%15s%15s%15s%20s%20s%15s%n",customer.getAccountNo(),customer.getCustomerName(),customer.getAccountType(),customer.getBalance(),customer.getPhoneNumber(),customer.getEmilId(),customer.getAtmPin());
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input....");
		}
		
	}
	private static void showBalance() {
		
		try
		{
			System.out.println("Enter the account Number: ");
			String accNo=input.nextLine();
			boolean found=false;
			for(Customer customer:customerList)
			{
				if(customer.getAccountNo().equals(accNo))
				{
					System.out.println("Your account balance is: "+customer.getBalance());
					found=true;
				}
			}
			if(!found)
			{
				System.out.println("Account not found with this account number...");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input....");
		}
	}
	private static void withdrawMoney() {
		try
		{
			System.out.println("Enter the account Number: ");
			String accNo=input.nextLine();
			boolean found=false;
			for(Customer customer:customerList)
			{
				if(customer.getAccountNo().equals(accNo))
				{
					System.out.println("Enter amount to withdraw: ");
					int amount=scanner.nextInt();
					int amountPresent=customer.getBalance()-customer.minBalance;
					if(amount>amountPresent)
					{
						System.out.println("Insufficient funds..");
					}
					else
					{
						customer.setBalance(customer.getBalance()-amount);
						System.out.println("Please collect you money!!!");
						System.out.println("Sucessful Transaction your account Balance is "+customer.getBalance());
						tranferedAmount=amount;
					}
					
					found=true;
				}
			}
			if(!found)
			{
				System.out.println("Account not found with this account number...");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input...");
		}
		
	}
	private static void depositMoney() {
		try
		{
			System.out.println("Enter the account Number: ");
			String accNo=input.nextLine();
			boolean found=false;
			for(Customer customer:customerList)
			{
				if(customer.getAccountNo().equals(accNo))
				{
					System.out.println("Enter amount to deposit: ");
					int amount=scanner.nextInt();
					if(amount>50000)
					{
						System.out.println("Enter your mobile number for validation: ");
						long phone=scanner.nextLong();
						if(customer.getPhoneNumber()==phone)
						{
							customer.setBalance(customer.getBalance()+amount);
							System.out.println("Sucessfully deposited!!!");
						}
						else
						{
							System.out.println("Wrong phone number!!!");
						}
					}
					else
					{
						customer.setBalance(customer.getBalance()+amount);
						System.out.println("Sucessfully deposited!!!");
					}
					found=true;
				}
			}
			if(!found)
			{
				System.out.println("Account not found with this account number...");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input...");
		}
		
	}
	private static void deleteCustomer() {
		try
		{	
			System.out.println("Enter the account Number: ");
			String accNo=input.nextLine();
			boolean found=false;
			for(Customer customer:customerList)
			{
				if(customer.getAccountNo().equals(accNo))
				{
					found=true;
					customerList.remove(customer);
					System.out.println("Sucessfully removed");
				}
			}
			if(!found)
			{
				System.out.println("Account not found with this account number...");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input....");
		}
		
	}
	private static void updateDetails() {
		try
		{
			System.out.println("Enter the account Number: ");
			String accNo=input.nextLine();
			boolean found=false;
			for(Customer customer:customerList)
			{
				if(customer.getAccountNo().equals(accNo))
				{
					found=true;
					System.out.println("Enter mobile number for updation:");
					long mob=scanner.nextLong();
					System.out.println("Enter email for updation: ");
					String email=input.nextLine();
					customer.updateDetails(mob, email);
				}
			}
			if(!found)
			{
				System.out.println("Account not found with this account number...");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input....");
		}
		
	}
	private static void addCustomer() {
		try
		{
			System.out.println("Enter Customer Name: ");
			String name=setValidCustomerName(input.nextLine());
			System.out.println("Please select account type :\n1.Savings \n2.Current");
			int acc=scanner.nextInt();
			String accType;
			if(acc==1)
			{
				accType="Savings";
			}
			else if(acc==2)
			{
				accType="Current";
			}
			else
			{
				System.out.println("Invalid acc type...By default system is taking as a saving acc");
				accType="Savings";
			}
			System.out.println("Enter your balance: ");
			String bal=setValidBalance(input.nextLine());
			int balance=Integer.parseInt(bal);
			System.out.println("Enter your phone number: ");
			String mob=setValidMobileNumber(input.nextLine());
			long phone=Long.parseLong(mob);
			System.out.println("Enter email address: ");
			String email=input.nextLine();
			customerList.add(new Customer(name,accType,balance,phone,email));
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input....");
		}
		
	}
	public static String setValidCustomerName(String customerName)
	{
		try{
			//creating object for bufferedReader
			//InputStreamReader isRead=new InputStreamReader(System.in);
			BufferedReader brRead=new BufferedReader(new InputStreamReader(System.in));
			
			//creating pattern using regular expression
			Pattern objPat=Pattern.compile("[^A-Za-z ]");
			do{
				//Matches
				Matcher matcher=objPat.matcher(customerName);
				boolean finder=matcher.find();
				
				if(finder)
				{
					System.out.println("Name must contain only Alphabets.Enter again: ");
					customerName=brRead.readLine();
				}
				else if(customerName.length()<3){
					
					System.out.println("Name should contain minimum 3 characters.");
					customerName=brRead.readLine();
					
				}else if(customerName.length()>30){
					
					System.out.println("Name contains more than 30 characters. Please Try Again: ");
					customerName=brRead.readLine();
					
				}
				else
				{
					break;
				}
			}while(true);
			
		}
		catch(Exception e)
		{
			System.out.println("Invalid entry in cutomer name");
			
			
		}
		return customerName;
	}
	public static String setValidMobileNumber(String mobnum)
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//int inputbal=Integer.parseInt(br.readLine());
			//Pattern pat=Pattern.compile("[^A-Za-z ]");
			Pattern pat=Pattern.compile("[^0-9 ]");
			do{
				//Matches
				Matcher matcher=pat.matcher(mobnum);
				boolean find=matcher.find();
				
				if(find)
				{
					System.out.println("Mobile number must contain only Numbers. Enter again: ");
					mobnum=br.readLine();
				}
				else if(mobnum.length()!=10){
					System.out.println("Mobile number must be only 10 digit,Enter again: ");
					mobnum=br.readLine();
				}
				else
				{
					break;
				}
			}while(true);
			
		}
		catch(Exception e)
		{
			System.out.println("Invalid entry in Mobile number");
			
			
		}
		return mobnum;
	}
	private static String setValidBalance(String balance)
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//int inputbal=Integer.parseInt(br.readLine());
			//Pattern pat=Pattern.compile("[^A-Za-z ]");
			Pattern pat=Pattern.compile("[^0-9 ]");
			do{
				//Matches
				Matcher matcher=pat.matcher(balance);
				boolean find=matcher.find();
				
				if(find)
				{
					System.out.println("Balance must contain only Numbers. Enter again: ");
					balance=br.readLine();
				}
				else
				{
					break;
				}
			}while(true);
			
		}
		catch(Exception e)
		{
			System.out.println("Invalid entry in balance");
			
			
		}
		return balance;
		
	}	
}

