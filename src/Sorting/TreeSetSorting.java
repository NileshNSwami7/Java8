package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetSorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t = new TreeSet<>((t1,t2)->(t1>t2)?-1:(t1<t2)?1:0);
		t.add(3);
		t.add(7);
		t.add(2);
		t.add(5);
		t.add(9);
		t.add(5);
		System.out.println("Natural default sorting:"+t);
		ArrayList<Integer> AL = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number");
		for(int i=0;i<5;i++) {
			AL.add(sc.nextInt());
		}
		System.out.println(AL);
		Collections.sort(AL);
		System.out.println(AL);
	}

}
