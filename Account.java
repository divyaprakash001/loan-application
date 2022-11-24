package com.divya.entitiesEnh;

import java.util.Scanner;

public class Account {
	private String accno;
	private long balance;
	Scanner sc = new Scanner(System.in);

	// method to open new account
	public void openAccount() {
		System.out.print("Enter Account No: ");
		accno = sc.next();
		System.out.print("Enter Balance: ");
		balance = sc.nextLong();
	}

	// method to display account details
	public void showAccount() {
		System.out.println("Account no.: " + accno);
		System.out.println("Balance: " + balance);
	}

	// method to deposit money
	public void deposit() {
		long amt;
		System.out.println("Enter the amount you want to deposit: ");
		amt = sc.nextLong();
		balance = balance + amt;
	}

	// method to withdraw money
	public void withdrawal() {
		long amt;
		System.out.println("Enter the amount you want to withdraw: ");
		amt = sc.nextLong();
		if (balance >= amt) {
			balance = balance - amt;
			System.out.println("Balance after withdrawal: " + balance);
		} else {
			System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
		}
	}

	// method to search an account number
	public boolean searchAcc(String ac_no) {
		if (accno.equals(ac_no)) {
			showAccount();
			return (true);
		}
		return (false);
	}
}
