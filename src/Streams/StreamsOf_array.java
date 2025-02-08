package Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsOf_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>l = new ArrayList<String>();
		l.add("bagha");
		l.add("natukaka");
		l.add("bawari");
		l.add("jethalal");
		l.add("magan");
		l.add("gadaelectronics");
		String str[] = l.stream().toArray(String[]::new);
		Stream<String>s = Stream.of(str);
		s.forEach(System.out::println);
	}

}
