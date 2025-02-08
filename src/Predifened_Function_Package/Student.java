package Predifened_Function_Package;

import java.util.ArrayList;

public class Student {
	
	
	private String stdname;
	private int mark;
	
	public Student() {
		super();
	}

	public Student(String stdname, int mark) {
		super();
		this.stdname = stdname;
		this.mark = mark;
	}
	
	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

	ArrayList<Student> list = new ArrayList<>();
	public ArrayList<Student> populate(){
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
