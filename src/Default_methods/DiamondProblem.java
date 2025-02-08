package Default_methods;

interface first
{
	default void method1()
	{
		System.out.println("First interface");
	}
}
interface second
{
	default void method1()
	{
		System.out.println("Second interface");
	}
}
public class DiamondProblem implements first,second {

	public void method1(){
		second.super.method1(); // we can solve the diamond problem with super keyword.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiamondProblem d =  new DiamondProblem();
		d.method1();
	}

}
