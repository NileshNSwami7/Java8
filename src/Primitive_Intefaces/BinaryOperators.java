package Primitive_Intefaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BiFunction<String,String,String>bf =(s1,s2)->s1 + s2;
		BinaryOperator <String> bf = (s1,s2)->s1 + s2;
		System.out.println(bf.apply("SAB", "Tv"));
	}

}
