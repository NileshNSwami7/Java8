package Predifened_Function_Package;

import java.util.Scanner;
import java.util.function.Function;

public class Difference_bet_andThen_and_compose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		Function<Integer,Integer>f1 = i->i+i;
		Function<Integer,Integer>f2 = i->i*i*i;
		
		System.out.println("Please enter number : ");
		num=sc.nextInt();
		System.out.println("Resuslt of andThen() : "+f1.andThen(f2).apply(num));
		System.out.println("Result of compose() : "+f1.compose(f2).apply(num));
	}

}
