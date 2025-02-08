package Predifened_Function_Package;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class Studentresult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		ArrayList<Student> list1 = new ArrayList<>();
		list1=std.populate();
		char ch;
		do {
		System.out.println("Please select Following Option:");
		System.out.println("1. All Student Result" +"\n"
				+ "2. Destinction Student");
		int num = sc.nextInt();
		switch(num) {
		case 1 : Studentresultservicelogic sl = new Studentresultservicelogic();
				 sl.displayAllStudent(list1);
				 break;
		case 2 : Studentresultservicelogic s2 = new Studentresultservicelogic();
		 		 s2.distcionStudent(list1);
				 break;
		default : System.out.println("Enter valid choice");
		}
		System.out.println("Do yo want to continue.");
		ch = sc.next().charAt(0);
		}while((ch=='Y') || (ch=='y')) ;
		
	}

}
