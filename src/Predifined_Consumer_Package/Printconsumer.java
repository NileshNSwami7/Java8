package Predifined_Consumer_Package;

import java.util.Scanner;
import java.util.function.Consumer;

public class Printconsumer {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");	
		String str = sc.next();
		Consumer<String>c = s->System.out.println(s);
		c.accept(str);
	}
	
}