package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Filter_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>l = new ArrayList<>(); 
		System.out.println("Please enter random numbers:");
		for(int i=0;i<10;i++) {
			l.add(sc.nextInt());
		}
	
		List<Integer>l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
	}

}
