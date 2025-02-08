package Streams;

import java.util.ArrayList;

public class Count_length_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>l = new ArrayList<String>();
		l.add("bagha");
		l.add("natukaka");
		l.add("bawari");
		l.add("jethalal");
		l.add("magan");
		l.add("gadaelectronics");
		System.out.println("List: " +l);
		long count = l.stream().filter(s->s.length()>=7).count();
		System.out.println("Total count of name whose length is greater than 7: "+count);
	}

}
