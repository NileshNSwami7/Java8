package Predefined_Package;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullOrEmptyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveNullOrEmptyString rmv = new RemoveNullOrEmptyString();
		String str[]= {"Rakshita","Rajan",null,"Veer","","Gulab","Dinesh",""};
		Predicate<String>pt = S -> (S != null && S.length()!=0);
		rmv.stringMethod(pt, str);
		
	}
	public void stringMethod(Predicate<String>pt,String sr[])  {
		ArrayList<String>al = new ArrayList<>();
		System.out.println("Array after removing removing null values:");
		for(String s:sr) {
			if(pt.test(s)) {
				al.add(s);
			}
		}
		System.out.println(al);
	}
}
