package Sorting;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>((a1,a2)->(a1>a2)?-1:(a1<a2)?1:0);
		System.out.println("Please Enter info");
		for(int i=0;i<3;i++) {
			tm.put(sc.nextInt(), sc.next());
		}
//		tm.put(31, "Nil");
//		tm.put(23, "Vana");
//		tm.put(27, "Shiv");
//		tm.put(25, "Anj");
//		tm.put(24, "Gan");
//		tm.put(21, "Myst");
		System.out.println("Natural Sorting Order:"+tm);
		System.out.println("Customized Sorting Order:"+tm);

	}

}
