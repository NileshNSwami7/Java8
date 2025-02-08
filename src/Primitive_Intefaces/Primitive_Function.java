package Primitive_Intefaces;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Primitive_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer>bf = (s)->s.length();
		System.out.println("Function : "+bf.apply("Nilesh"));
		
		//##############################################################
		
		ToIntFunction<String> If = (s)->s.length();
		System.out.println("Primitive Function : "+If.applyAsInt("Nilesh"));
		
		//##############################################################
		IntToDoubleFunction Df = (i)->Math.sqrt(i);
		System.out.println("IntToDouble Function : "+Df.applyAsDouble(5));
		
	}

}
