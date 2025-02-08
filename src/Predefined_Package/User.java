package Predefined_Package;

import java.util.function.Predicate;

public class User  {
	
	private String username;
	
	private String password;

	
	public User() {
		super();
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	public void checksd(Predicate<User>pa,User u) {
//		Predicate<User>pa = s->this.username.equals("Nilesh")&&this.password.equals("Pass@1");
		if(pa.test(u)) {
			System.out.println("Authentication Successfull");
		}else {
			System.out.println("Wrong username and password");
		}
	}
	
	
	
	

	
	
}
