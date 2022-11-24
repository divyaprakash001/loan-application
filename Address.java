package com.divya.entities;

import java.util.Scanner;


//dependent obect
public class Address {
	private String hNo;
	private String city;
	private String dist;
	private String state;
	private String country;
	private String pCode;
	Scanner sc = new Scanner(System.in);

	public void addDetails() {
		System.out.println("enter your home number");
		hNo = sc.next();
		System.out.println("enter your city name");
		city = sc.next();
		System.out.println("enter your district name");
		dist = sc.next();
		System.out.println("enter your state name");
		state = sc.next();
		System.out.println("enter your country name");
		country = sc.next();
		System.out.println("enter your pin code number");
		pCode = sc.next();
	}

	public void displayAddress() {
		System.out.println("Home No  :: " + hNo);
		System.out.println("City     :: " + city);
		System.out.println("Dist     :: " + dist);
		System.out.println("State    :: " + state);
		System.out.println("Country  :: " + country);
		System.out.println("Pin Code :: " + pCode);
	}
}
