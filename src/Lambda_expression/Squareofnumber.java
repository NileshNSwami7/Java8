package Lambda_expression;

import java.util.Scanner;

interface Square
{
	public int SquareOf(int num);
	
}
public class Squareofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number:");
		n=sc.nextInt();
		Square s = (i)-> i*i;
		System.out.println("Square of "+ n +" is " +s.SquareOf(n));
	}

}
