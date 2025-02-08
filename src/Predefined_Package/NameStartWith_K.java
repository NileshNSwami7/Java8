package Predefined_Package;

import java.util.function.Predicate;

public class NameStartWith_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameStartWith_K k = new NameStartWith_K();
		String str[]= {"Suvarna","Kajal","Katrina","Rani","Aishwarya","Krishna"};
		Predicate<String>st = s->(s.charAt(0)=='K');
		System.out.println("Name Start with K:");
		k.checkMethod(st,str);
	}
	public void checkMethod(Predicate<String>k,String ktr[]) {
		for(String s:ktr) {
			if(k.test(s)) {
				System.out.println(s);
			}
		}
	}
}
