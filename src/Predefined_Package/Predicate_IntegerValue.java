package Predefined_Package;

import java.util.function.Predicate;

public class Predicate_IntegerValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(5));
		System.out.println(p.test(78));
	}

}
