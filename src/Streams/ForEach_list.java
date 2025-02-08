package Streams;

import java.util.ArrayList;

public class ForEach_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>l = new ArrayList<String>();
		l.add("bagha");
		l.add("natukaka");
		l.add("bawari");
		l.add("jethalal");
		l.add("magan");
		l.add("gadaelectronics");
		l.stream().forEach(s->System.out.println(s));
		System.out.println("########################################");
		l.stream().forEach(System.out::println);

	}

}
