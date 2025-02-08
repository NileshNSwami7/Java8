package Primitive_Intefaces;

import java.util.function.IntPredicate;

public class Prirmitive_Int_Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Type of primitive predicate.
		
		IntPredicate ip = (i)->i%2==0; //LongPredicate , DoublePredicate
		int num[] = {2,6,4,9,3,5,7,10};
		for(int i : num) {
			if(ip.test(i))
			{
				System.out.println(i);
			}
		}
	}

}
