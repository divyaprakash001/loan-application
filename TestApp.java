package com.divya.LoanTestAppEnh;

import java.util.Scanner;

import com.divya.entitiesEnh.Loan;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l = new Loan();

		Scanner sc = new Scanner(System.in);
		int ch;
		int lh;
		int log;

		do {
			System.out.println("\n ***Loan System Application***");
			System.out.println("1. Sign Up \n2. Login \n3. Exit");
			System.out.println("Enter your choice: ");
			log = sc.nextInt();
			switch (log) {
			case 1:
				l.registerUser();
				do {
					System.out.println("1. Show my details \n 2. Apply For Loan \n 3. Exit \n ");
					System.out.println("Enter your choice: ");
					ch = sc.nextInt();

					switch (ch) {
					case 1:
						System.out.println("enter your aadhar number");
						Long aadharr = sc.nextLong();
						boolean found = false;
						found = l.search(aadharr);
						if (found) {
							break;
						} else {
							System.out.println("Search failed! Account doesn't exist..!!");
						}
						break;
					case 2:
						do {
							System.out.println("1. Home Loan \n2. Car Laon \n3. Personal Loan \n 4. Exit");
							lh = sc.nextInt();
							switch (lh) {
							case 1:
								if (l.passTheLoan() == true) {
									l.applyHomeLoan();
									l.hEMI();
								} else {
									System.out.println("you cannot apply the loan \n "
											+ "age should be under between 18 and 60 \n "
											+ "and annual income should be at least 200000");
								}
								break;
							case 2:
								if (l.passTheLoan() == true) {
									l.applyHomeLoan();
									l.cEMI();
								} else {
									System.out.println("you cannot apply the loan \n "
											+ "age should be under between 18 and 60 \n "
											+ "and annual income should be at least 200000");
								}
								break;
							case 3:
								if (l.passTheLoan() == true) {
									l.applyHomeLoan();
									l.pEMI();
								} else {
									System.out.println("you cannot apply the loan \n "
											+ "age should be under between 18 and 60 \n "
											+ "and annual income should be at least 200000");
								}
								break;
							default:
								System.out.println("choose correct one please");
							}
						} while (lh != 4);
						break;
					case 3:
						System.out.println("See you soon");
						break;
					default:
						System.out.println("choose correct one please");
					}
				} while (ch != 3);
				break;
			case 2:
				System.out.println("Feature Coming Soon");
				break;
			case 3:
				System.out.println("Thanks for using My Application, See you soon!");
				break;
			default:
				System.out.println("choose correct one please");
			}

		} while (log != 3);

	}

}
