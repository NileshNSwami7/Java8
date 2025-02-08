package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map_adding_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>l = new ArrayList<String>();
		l.add("bagha");
		l.add("natu kaka");
		l.add("bawari");
		l.add("jethalal");
		l.add("magan");
		l.add("gada electronics");
		System.out.println("List: " +l);
		List<String>l1= l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l1);
	}

}
