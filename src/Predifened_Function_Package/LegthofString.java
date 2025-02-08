package Predifened_Function_Package;

import java.util.function.Function;

public class LegthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Love my India";
		Function<String,String> f=(S1)->S1.replaceAll(" ","");
		System.out.println("Original String");
		System.out.println(str);
		System.out.println("***********************************************************");
		System.out.println("Remoing all blank spaces");
		System.out.println(f.apply(str));
		System.out.println("***********************************************************");
		System.out.println("Count all blank spaces");
		Function<String,Integer>f1 = S2->S2.length() - S2.replaceAll(" ","").length();
		System.out.println(f1.apply(str));
	}

}
