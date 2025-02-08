package Double_Colon_Operator;

public class Runnable_doublecolon {
	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("This is child thread.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//       :: operator with the help of lambda expression.

		/*
		 * Runnable r = ()->{ for(int i=0;i<10;i++) {
		 * System.out.println("This is child thread."); } };
		 */

//      :: With the help of method referance. 

		Runnable_doublecolon rd = new Runnable_doublecolon();
		Runnable r = rd::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("This is main thread.");
		}

	}

}
