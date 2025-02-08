package Predicates_and_Function;

import java.util.ArrayList;
import java.util.Scanner;

public class Company extends Passenger{

	
	ArrayList<Passenger> p = new ArrayList<Passenger>();
	
	
	public Company(int passengerid, String passengername, String address, double charges, String pass, String email,
			String mobile, int age) {
		super(passengerid, passengername, address, charges, pass, email, mobile, age);
		// TODO Auto-generated constructor stub
	}

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public void login() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String passngername = sc.next();
		System.out.println("Eneter mobile number");
		String mobileno = sc.next();
		System.out.println("Enter email adress");
		String email = sc.next();
		System.out.println("Enter Password");
		String pass = sc.next();
		
		p.add(new Passenger(passngername, pass, email, mobileno));
		System.out.println(p);
	}
	

}
