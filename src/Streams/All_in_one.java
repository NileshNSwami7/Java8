package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class All_in_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>l = new ArrayList<String>();
		l.add("bagha");
		l.add("natukaka");
		l.add("bawari");
		l.add("jethalal");
		l.add("magan");
		l.add("gadaelectronics");
		List<Integer>l1 = l.stream().map(s1->s1.length()).collect(Collectors.toList());
		System.out.println(l1);
		String []str = l.stream().toArray(String[]::new);
//		List<Integer>l2=str.stream().min((s1,s2)->s1.compareTo(s2)).get();
//		int num =l1.stream().map(l.stream().min((s1,s2)->s1.compareTo(s2)).get()).collct(Collectors.toList());
//		System.out.println();
	}

}
