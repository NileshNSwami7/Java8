package Streams;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MIN_MAX_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>l = new ArrayList<>(); 
		System.out.println("Please enter random numbers:");
		for(int i=0;i<10;i++) {
			l.add(sc.nextInt());
		}
		int num = l.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Min : "+num);
		int num1 = l.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Max :" +num1);

	}

}
