package Predefined_Package;

import java.util.Collection;
import java.util.function.Predicate;

public class Predicate_StringValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String>p = s->(s.length()>10);
		Predicate<Collection>str = b->b.isEmpty();
		System.out.println(p.test("Length of String"));
//		System.out.println(str.test());
	}

}
