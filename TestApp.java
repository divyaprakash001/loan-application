package com.divya.LoanTestApp;

import java.util.Scanner;

import com.divya.entities.Loan;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l = new Loan();
		l.registerUser();

		Scanner sc = new Scanner(System.in);
		int ch;
		int lh;

		do {
			System.out.println("\n ***Loan System Application***");
			System.out.println("1. Show my details \n 2. Apply For Loan \n 3. Exit \n ");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("enter your aadhar number");
				Long aadhar = sc.nextLong();
				boolean found = false;
				found = l.search(aadhar);
				if (found) {
					break;
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 2:
				System.out.println("1. Home Loan \n 2. Car Laon \n 3. Personal Loan \n");
				lh = sc.nextInt();
				switch (lh) {
				case 1:
					if (l.passTheLoan() == true) {
						l.applyHomeLoan();
						l.hEMI();
					} else {
						System.out.println("you cannot apply the loan \n " + "age should be under between 18 and 60 \n "
								+ "and annual income should be at least 200000");
					}
					break;
				case 2:
					if (l.passTheLoan() == true) {
						l.applyHomeLoan();
						l.cEMI();
					} else {
						System.out.println("you cannot apply the loan \n " + "age should be under between 18 and 60 \n "
								+ "and annual income should be at least 200000");
					}
					break;
				case 3:
					if (l.passTheLoan() == true) {
						l.applyHomeLoan();
						l.pEMI();
					} else {
						System.out.println("you cannot apply the loan \n " + "age should be under between 18 and 60 \n "
								+ "and annual income should be at least 200000");
					}
					break;
				}
				break;
			case 3:
				System.out.println("See you soon");
				System.exit(0);
				break;
			}

		} while (ch != 3);

	}

}
