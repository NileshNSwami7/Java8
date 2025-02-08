package Annanomousinnerclass;

interface interf{
	public void m1();
}
public class annymosInnerclass {
	
	int x=888;
	public void m2() {
		int y=777;
		interf i=()->{
			int x=7;
			int n=9;
			System.out.println("Inner class"+x);
			System.out.println("Inner class"+n);
			
			x=10;
//			y=5;
		};
		i.m1();
		System.out.println(y);
		x=999;
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		annymosInnerclass aic = new annymosInnerclass();
		aic.m2();
		
	}

}
