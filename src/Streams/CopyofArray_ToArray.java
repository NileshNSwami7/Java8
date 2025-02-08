package Streams;

import java.util.ArrayList;

public class CopyofArray_ToArray {

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
		for(String s : str)
		{
			System.out.println(s);
		}
	}

}
