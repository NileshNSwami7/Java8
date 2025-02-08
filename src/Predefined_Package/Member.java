package Predefined_Package;

import java.util.function.Predicate;

public class Member {

	private String membername;
	private int age;

	public Member(String membername, int age) {
		super();
		this.membername = membername;
		this.age = age;
	}

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void entry(Member mr) {
		Predicate<Member> pm = m -> age>18;
		if(pm.test(mr))
		{
			System.out.println("Member is above 18 is we are allowed.");
		}
		else {
			System.out.println("Members age is not an adult person so we are not allowed.");
		}
	}
}
