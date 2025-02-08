package Predefined_Package;

import java.util.function.Predicate;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatestNumber gt = new GreatestNumber();
		int num[]= {0,5,10,15,20,25,30};
		Predicate<Integer>p1 = I->(I>10);
		Predicate<Integer>p2 = J->(J%2==0);
		System.out.println("The number is greater than 10 :");
		gt.method1(p1,num);
		System.out.println("Even numbers are:");
		gt.method1(p2,num);
		System.out.println("The number is not greater than 10");
		gt.method1(p1.negate(), num);
		System.out.println("The number is greater than 10 and even");
		gt.method1(p1.and(p2),num);
		System.out.println("The number is greater than 10 or even");
		gt.method1(p1.or(p2), num);
	}
	public void method1(Predicate<Integer>p,int num[]) {
		for(int n:num) {
			if(p.test(n))
			{
				System.out.println(n);
			}
		}
	}

}
