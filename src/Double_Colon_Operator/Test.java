package Double_Colon_Operator;

interface Doublecolon{
	public void m1();
}
public class Test {
	
	public static void m2() {
		System.out.println("This is used of double colon operator.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doublecolon dc = Test::m2;
		dc.m1();
	}

}
