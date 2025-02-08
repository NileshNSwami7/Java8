package Predifined_Consumer_Package;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student_Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		ArrayList<Student>list = std.populate();
		Predicate<Student>p = m->m.getMarks()>=50;
		Function<Student,String>f = s->{
			if(s.getMarks()>=75) {
				return "A+ Designation";
			}else if(s.getMarks()>66.6) {
				return "A First class";
			}else if(s.getMarks()>60) {
				return "B Second class";
			}else if(s.getMarks()>50) {
				return "C Third class";
			}else if(s.getMarks()>35) {
				return "D Pass class";
			}else {
				return "E Failed";
			}
		};
		Consumer<Student>c = s->{
			System.out.println("############################");
			System.out.println("Student name : "+s.getEname());
			System.out.println("Student marks : "+s.getMarks());
			System.out.println("Student designation : "+f.apply(s));
			System.out.println("############################");
		};
		
		for(Student s :list) {
			if(p.test(s)) {
				c.accept(s);
			}
		}
	}

}
