package BiFunction_BiPredicate;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Student_manu {
	public static void main(String[] args) {
		Student std = new Student();
		ArrayList<Student>list = new ArrayList<>();
		
		BiFunction<String,Integer,Student>BF = (name,rollno)->new Student(name,rollno);
		for(Student s:std.populate()) {
			list.add(BF.apply(s.getName(), s.getRollno()));
		}
		for(Student s:list) {
			System.out.println("################################");
			System.out.println("Student name : "+s.getName());
			System.out.println("Student rollno : "+s.getRollno());
			System.out.println("################################");
		}
	}
}
