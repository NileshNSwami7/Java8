package BiFunction_BiPredicate;

import java.util.ArrayList;


public class Student {
	
	private String name;
	private int rollno;
	
	public Student() {
		super();
	}
	
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public ArrayList<Student> populate(){
		ArrayList<Student>list = new ArrayList<>();
		list.add(new Student("Nilesh",86));
		list.add(new Student("Raj",83));
		list.add(new Student("Rahul",74));
		list.add(new Student("karan",86));
		list.add(new Student("yatin",56));
		list.add(new Student("Rahul",37));
		list.add(new Student("pooja",55));
		list.add(new Student("Shekhar",83));
		list.add(new Student("kajal",48));
		list.add(new Student("nitin",62));
		list.add(new Student("chetan",76));
		list.add(new Student("Ashok",88));
		return list;
	}
}
