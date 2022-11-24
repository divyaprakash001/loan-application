package com.divya.entities;

import java.util.Scanner;

public class Loan {
	private String name;
	private Integer age;
	private String fName;
	private String mName;
	private Long aadhar;
	private Long mobile;
	private String gender;
	private Address address; // HAS-A Variable
	private String occupation;
	private Long income;
	private Float lAmount;
	private Float lDuration;
	private static Float cRoi;
	private static Float hRoi;
	private static Float pRoi;
	public Float emi;
	public Boolean status = false;

//	setting rate of interest for all type of loan
	static {
		pRoi = 10.50f;
		cRoi = 7.0f;
		hRoi = 6.40f;
	}

	Scanner sc = new Scanner(System.in);

//	greeting message
	{
		System.out.println("************** Dear user , Welcome to DIVYA's Loan Application **************");
	}

//	method to register
	public void registerUser() {
		address = new Address();
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Enter your age");
		age = sc.nextInt();
		System.out.println("Enter your father's first name");
		fName = sc.next();
		System.out.println("Enter your mother's first name");
		mName = sc.next();
		System.out.println("Enter your gender");
		gender = sc.next();
		System.out.println("Enter your address");
		address.addDetails();
		System.out.println("Enter your aadhar number");
		aadhar = sc.nextLong();
		System.out.println("Enter your mobile number");
		mobile = sc.nextLong();
		System.out.println("Enter your occupation");
		occupation = sc.next();
		System.out.println("Enter your annual income");
		income = sc.nextLong();
	}

//	method to display user details
	public void userDetails() {
		System.out.println("Name        ::  " + name);
		System.out.println("Age         ::  " + age);
		System.out.println("F's Name    ::  " + fName);
		System.out.println("M's Name    ::  " + mName);
		System.out.println("Gender      ::  " + gender);
		System.out.println("Aadhar      ::  " + aadhar);
		System.out.println("Mobile      ::  " + mobile);
		System.out.println("Occupation  ::  " + occupation);
		System.out.println("Income      ::  " + income);
		address.displayAddress();
	}

//	method to check egibilty
	public boolean passTheLoan() {
		if ((age >= 18 && age <= 60) && (income >= 200000)) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

//	method to apply loan
	public void applyHomeLoan() {
		System.out.println("Welcome to Home Loan Portal");
		System.out.println("Enter your loan amount");
		lAmount = sc.nextFloat();
		System.out.println("Enter your time duration");
		lDuration = sc.nextFloat();
	}

//	***************************emi calculator********************************************

	public float emi_calculator(float p, float r, float t) {
		float emi;
		r = r / (12 * 100); // one month interest
		t = t * 12; // one month period
		emi = (p * r * (float) Math.pow(1 + r, t)) / (float) (Math.pow(1 + r, t) - 1);
		return (emi);
	}

//	emi calculator for home loan
	public void hEMI() {
		emi = emi_calculator(lAmount, hRoi, lDuration);
		System.out.println("emi per month for your home loan is " + emi);
	}

//	emi calculator for car loan
	public void cEMI() {
		emi = emi_calculator(lAmount, cRoi, lDuration);
		System.out.println("emi per month for your car laon is " + emi);
	}

//	emi calculator for personal loan
	public void pEMI() {
		emi = emi_calculator(lAmount, pRoi, lDuration);
		System.out.println("emi per month for your personal loan is " + emi);
	}

//	******************************** Searching with aadhar number ************************************************
	public boolean search(Long aadhar) {
		if (aadhar.equals(aadhar)) {
			userDetails();
			return (true);
		}
		return (false);
	}
//	***************************************************************************************

}
