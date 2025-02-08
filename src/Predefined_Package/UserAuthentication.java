package Predefined_Package;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to run a perticular program:"
				+ "1. User Authentication"+
				  " 2. Members age"+" :");
		int num =  sc.nextInt();
		switch(num){
			case 1:
				Predicate<User>pa=(u)->u.getUsername().equals("Nilesh")&&u.getPassword().equals("Nilesh");
				User u = new User();
				UserCheck uc = new UserCheck();
				System.out.println("Enter username:");
				u.setUsername(sc.next());
				System.out.println("Enter password:");
				u.setPassword(sc.next());
				u.checksd(pa,u);
//				uc.userChekced(pa,u);
				break;
			case 2:
				Member m = new Member();
				System.out.println("Enter member name: ");
				m.setMembername(sc.next());
				System.out.println("Enter your age:");
				m.setAge(sc.nextInt());
				m.entry(m);
				break;
			default:
				System.out.println("Please select proper input and rerun the programm Thank You!!!!!");
				break;
			
		}
		
		
		
	}
}
