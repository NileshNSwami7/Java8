package Primitive_Intefaces;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Primitive_binaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinaryOperator pbo = (s1,s2)-> s1 + s2;
		System.out.println(pbo.applyAsInt(10, 20));
	}

}
