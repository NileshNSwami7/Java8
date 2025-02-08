package Predifened_Function_Package;

import java.util.Scanner;
import java.util.function.Function;

public class Function_chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Function<String,String>f1 = s->s.toUpperCase();
		Function<String,String>f2 = s1->s1.substring(0, 9);
		System.out.println("Please enter string:");
		String str = sc.next();
		System.out.println("Function F1 UpperCase : "+f1.apply(str));
		System.out.println("Function F2 get Substring upto 9 character: "+f2.apply(str));
		System.out.println("Function andThen() method : "+f1.andThen(f2).apply(str));
		System.out.println("Function composed method : "+f1.compose(f2).apply(str));
	}

}
