package Predicates_and_Function;

import java.util.Scanner;

public class Travel_agency_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Company c = new Company();
		System.out.println("****Welcome to Swami Travel Agency****");
		char ch;
		do {
			System.out.println("Please select the following option"); 
			System.out.println("1.Login");
			System.out.println("2.Signup");
			System.out.println("3.Exit");
			
			switch(sc.nextInt()) {
			case 1: c.login();
					break;
//			case 2: c.Signup();
//					break;
			case 3: System.out.println("Thank you for selecting Swami Travels");
					break;
			default : System.out.println("Please select option in following list");
			}
			System.out.println("Do you want to continue if yes press y else n");
			ch=sc.next().charAt(0);
			System.exit(0);
		}
		while(ch=='y'||ch=='Y');
	}

}
