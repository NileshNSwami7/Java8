package Predefined_Package;

import java.util.function.Predicate;

public class UserCheck {
	
	public void userChekced(Predicate<User>pa,User u) {

		if(pa.test(u)) {
			System.out.println("Success");
		}else{
			System.out.println("Fail");
		}
	}

}
