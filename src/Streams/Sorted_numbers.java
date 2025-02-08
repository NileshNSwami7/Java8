package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sorted_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>l = new ArrayList<>(); 
		System.out.println("Please enter random numbers:");
		for(int i=0;i<10;i++) {
			l.add(sc.nextInt());
		}
		List<Integer>l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorting with default order : "+ l1);
		List<Integer>l2 = l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Customize sorting order : "+l2);
		
	}

}
