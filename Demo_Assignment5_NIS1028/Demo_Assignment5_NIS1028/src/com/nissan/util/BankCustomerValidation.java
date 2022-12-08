package com.nissan.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.nissan.exception.BankAppCustomException;
import com.nissan.pojo.BankCustomer;

public class BankCustomerValidation {

	public static BankCustomer validateBankCustomer(String customerName,
			String accountNumber, double balance, String panNumber)
			throws BankAppCustomException {

		validateCustomerName(customerName);
		validateAccountNumber(accountNumber);
		validateBankBalance(balance);
		validatePanNumber(panNumber);

		return new BankCustomer(customerName, accountNumber, balance, panNumber);
	}

	// method to validate customer name
	private static void validateCustomerName(String name)
			throws BankAppCustomException {
		
		Pattern pattern = Pattern.compile("[^A-Za-z ]");
		Matcher matcher = pattern.matcher(name);
		boolean match = matcher.find();

		if (match) {
			if (name.length() > 15) {
				throw new BankAppCustomException(
						"Name length can't be greater than 15 letters");
			}
		}
		throw new BankAppCustomException("Name must contain alphabets only");
	}

	// method to validate account number
	private static void validateAccountNumber(String accNumber)
			throws BankAppCustomException {
		if(accNumber.length() != 10) {
			throw new BankAppCustomException("Account number must be a 10-digit number");
		}
		
		for(int i = 0; i < accNumber.length(); i++) {
			if(!Character.isDigit(accNumber.charAt(i))) {
				throw new BankAppCustomException("Account number must be in numeric only!!!");
			}
		}
	}

	// method to validate account opening balance
	private static void validateBankBalance(double balance)
			throws BankAppCustomException {
		try {
			if (balance < 1000) {
				throw new BankAppCustomException(
						"Account opening balance must be greater than 1000!!!");
			}

		} catch (NumberFormatException nfc) {
			System.out.println("The balance must be in numeric format");
		}
	}

	// method to validate PAN Number
	private static void validatePanNumber(String panNum)
			throws BankAppCustomException {
		if (panNum.length() != 10) {
			throw new BankAppCustomException(
					"PAN Number must have 10 characters");
		}
	}
}
