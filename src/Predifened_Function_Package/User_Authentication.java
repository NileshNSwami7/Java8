package Predifened_Function_Package;

import java.util.Scanner;
import java.util.function.Function;

public class User_Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String user = sc.next();
		System.out.println("Enter Password : ");
		String pwd =sc.next();
		Function<String,String>f1 = s->s.substring(0,5);
		Function<String,String>f2 = s->s.toLowerCase();
		System.out.println(f1.apply(user));
		System.out.println(f2.apply(user));
		if(f1.andThen(f2).apply(user).equals("niles") && pwd.equals("java")) {
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid User");
		}
	}

}
