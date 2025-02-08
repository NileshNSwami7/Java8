package Lambda_expression;

interface interf{
	public void add(int a,int b);

}
public class Invoke_lambda_expression  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf i = (a,b)->{
			System.out.println("Sum:"+(a+b));
		};
		i.add(5,6);
	}

}
