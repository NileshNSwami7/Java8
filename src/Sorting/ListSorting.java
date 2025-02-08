package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyCollection implements Comparator<Integer>{
	
	public int compare(Integer i1,Integer i2) {
//		if(i1>i2) {
//			return -1;
//		}
//		else if(i1<i2) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
	return (i1>i2)?-1:(i1<i2)?1:0;
	}
}
public class ListSorting {
	
	public static void main(String[] arr) {
		
		ArrayList<Integer> i = new ArrayList<>();
		i.add(5);
		i.add(4);
		i.add(2);
		i.add(1);
		i.add(9);
		i.add(8);
		System.out.println("Before Sorting Order:"+ i);
		Collections.sort(i);
		System.out.println("After or Default Sorting Order :"+i);
		Collections.sort(i,new MyCollection());
		System.out.println("Customized sorting Order WithoutLambda Expression:"+i);
		
		Collections.sort(i,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		System.out.println("Customized sorting Order With Lambda Expression:"+i);
	}
}
