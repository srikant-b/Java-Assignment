package com.nissan.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nissan.exception.BankAppCustomException;
import com.nissan.pojo.BankCustomer;

public class BankCustomerUtil {

	private static Scanner scan = new Scanner(System.in);

	// pre-loaded list
	public static List<BankCustomer> loadBankCustomerDetails() {
		List<BankCustomer> bankCustomerList = new ArrayList<>();

		bankCustomerList.add(new BankCustomer("Aditya", "7690421345", 67954,
				"GBYPS9647C"));
		bankCustomerList.add(new BankCustomer("Mukit", "9862654321", 8000,
				"LODBG8254C"));
		bankCustomerList.add(new BankCustomer("Raj", "7980856175", 6000,
				"POKYR0864C"));
		bankCustomerList.add(new BankCustomer("Roy", "8609345345", 8000000,
				"APRYS8512C"));
		bankCustomerList.add(new BankCustomer("Mahesh", "7690936456", 679540,
				"AFGPS8437C"));

		return bankCustomerList;
	}

	// method to deposit money
	public static void depositMoney(String accNumber,
			List<BankCustomer> bankCustomerList) throws BankAppCustomException {
		// try (Scanner scan = new Scanner(System.in)) {
		BankCustomer checkCustomer = new BankCustomer(accNumber);

		// iterating over the list to find the customer with the given acc
		// number
		for (BankCustomer customer : bankCustomerList) {

			// if customer is found
			if (customer.equals(checkCustomer)) {

				// ask for deposit amount
				System.out.println("Enter deposit amount: ");
				double deposit = scan.nextDouble();
				// if deposit amount is more than 50k, ask for PAN and verify PAN
				if (deposit > 50000) {
					System.out.println("Enter your PAN Card number: ");
					scan.nextLine();
					String panNumber = scan.nextLine().toUpperCase();
					// if PAN doesn't match
					if (!customer.getPanNumber().equals(panNumber)) {
						throw new BankAppCustomException(
								"PAN Number does not match with the account number!!!");
					}
				}
				// if everything is fine, add the amount to the balance
				customer.setBalance(customer.getBalance() + deposit);
				return;
			}
		}

		// if no customer with the account number is found
		throw new BankAppCustomException("No customer with account number "
				+ accNumber + " exists!!!");
		// }
	}

	// method to withdraw money
	public static void withdrawMoney(String accNumber,
			List<BankCustomer> bankCustomers) throws BankAppCustomException {
		// try (Scanner scan = new Scanner(System.in)) {
		BankCustomer checkCustomer = new BankCustomer(accNumber);

		// iterating over the list and finding the customer
		for (BankCustomer customer : bankCustomers) {
			// is customer is found
			if (customer.equals(checkCustomer)) {

				// asking for withdrawal amount
				System.out.println("Enter withdrawal amount: ");
				double withdrawalAmount = scan.nextDouble();

				if (customer.getBalance() - withdrawalAmount < 1000) {
					throw new BankAppCustomException("Insufficient funds!!!!");
				}
				// Ask for PAN if withdrawal amount > 50k
				else if (withdrawalAmount > 50000) {
					System.out.println("Enter your PAN Card number: ");
					scan.nextLine();
					String panNumber = scan.nextLine().toUpperCase();
					// check if the PAN matches or not
					if (!customer.getPanNumber().equals(panNumber)) {
						// if PAN doesn't match
						throw new BankAppCustomException(
								"PAN Number does not match with the account number!!!");
					}
				}
				// If everything is fine then deduct the amount
				customer.setBalance(customer.getBalance() - withdrawalAmount);

				// Display balance after deduction
				System.out.println("Available balance: "
						+ customer.getBalance());
			}
		}
		// }
	}

	// method to check balance
	public static void showBalance(String accNumber,
			List<BankCustomer> bankCustomers) throws BankAppCustomException {
		BankCustomer currentUser = new BankCustomer(accNumber);

		// check if the account number exist in the database/collection
		for (BankCustomer customer : bankCustomers) {
			// if the acc no. is found
			if (customer.equals(currentUser)) {
				// Display balance
				System.out.println("Available Balance: "
						+ customer.getBalance());
				return;
			}
		}
		// if the account number is not there in the database/collection
		throw new BankAppCustomException("No customer with account number "
				+ accNumber + " exists!!!");
	}

	// method to transfer money
	public static String transferAmount(String senderAccNumber,
			String receiverAccNumber, List<BankCustomer> bankCustomers)
			throws BankAppCustomException {
		// try (Scanner scan = new Scanner(System.in)) {
		// Prompting user to input depositor's acc. no.
		BankCustomer depositor = new BankCustomer(senderAccNumber);
		// Prompting user to input beneficiary's acc. no.
		BankCustomer beneficiary = new BankCustomer(receiverAccNumber);

		// check if the depositor's acc. no. exist or not
		for (BankCustomer sender : bankCustomers) {
			// if sender's acc. no. is found
			if (sender.equals(depositor)) {
				// check for beneficiary's acc. no.
				for (BankCustomer receiver : bankCustomers) {
					// if beneficiary's acc. no. is found
					if (receiver.equals(beneficiary)) {
						// prompting user to inpur the tranfer amount
						System.out.println("Enter the amount to transfer: ");
						double transferAmount = scan.nextDouble();

						// if transer amount is more than Min balance
						if (sender.getBalance() - transferAmount < 1000) {
							throw new BankAppCustomException(
									"Insufficient funds!!!");
						}
						// if transfer amount is more than 50k, ask for PAN and
						// verify PAN
						else if (transferAmount > 50000) {
							System.out.println("Enter your PAN Card number: ");
							scan.nextLine();
							String panNumber = scan.nextLine().toUpperCase();

							// if PAN Number doesn't match
							if (!sender.getPanNumber().equals(panNumber)) {
								throw new BankAppCustomException(
										"PAN Number does not match with the account number!!!");
							}
						}
						// if everything is fine, deduct the amount from
						// sender's balance
						sender.setBalance(sender.getBalance() - transferAmount);
						// add amount to beneficiary's balance
						receiver.setBalance(receiver.getBalance()
								+ transferAmount);
						return "Transferred Amount Successfully!!!";
					}
				}
				// if receiver is not found
				throw new BankAppCustomException(
						"Receiver with account number " + receiverAccNumber
								+ " not found");
			}
		}
		// if depositor is not found
		throw new BankAppCustomException("Depositor with account number "
				+ senderAccNumber + " not found");
		// }
	}
}
