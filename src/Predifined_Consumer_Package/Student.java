package Predifined_Consumer_Package;

import java.util.ArrayList;

public class Student {
	
	private String ename;
	private double marks;
	public Student() {
		super();
	}
	public Student(String ename, double marks) {
		super();
		this.ename = ename;
		this.marks = marks;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
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
