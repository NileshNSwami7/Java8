package Default_methods;

/* Static method inside inteface
 
1. Until 1.8 version static method was not allowed in interface 
2. Upto Java 1.8 version static methods allowed in interface but we can not call directly.
3. We can call static method with the help of interface name directly. 
4. Upto java 1.8 version we can't override static method into implemented class but we can write the same method in implemented class.
5. We can write the same method with reduceing scope of access specifier in implemented class.
6. Also we can write main method in interface.
*/

interface interf{
	public static void method1() {
		System.out.println("Static method interface");
	}
	public static void main(String[] args) {
		System.out.println("Main method in interface");
	}
}
public class StaticMethodProblem {

	public static void method1() {
		System.out.println("static method in class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method in class");
		interf.main(args);
		interf.method1();
		StaticMethodProblem.method1();

	}

}
