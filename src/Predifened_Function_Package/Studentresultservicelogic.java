package Predifened_Function_Package;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Studentresultservicelogic {
	
	public void displayAllStudent(ArrayList<Student>list) {
		Function<Student,String>f = s->{
			if(s.getMark()>=75) {
				return "A (Destinction)";
			}else if(s.getMark()<=75 || s.getMark()>=66.6) {
				return "B (First Class)";
			}else if(s.getMark()<66.6 || s.getMark()>=58) {
				return "C (Second class)";
			}else if(s.getMark()>58 || s.getMark()>=50) {
				return "D (Third Class)";
			}else if(s.getMark()>50 || s.getMark()<=35) {
				return "E (Pass Class)";
			}else {
				return "F (Failed)";
			}
		};
		System.out.println("###############################################");
		System.out.println("##" +"  Studen Name    "+"||"   +"  Marks  " + "||" + " Grade " + "   ##");
		System.out.println("###############################################");
		for(Student s : list) {
			System.out.println("##  "+ s.getStdname()  + "             " +s.getMark()+ "%" + "       "+ f.apply(s)+"   ##");
		}
	}
	
	public void distcionStudent(ArrayList<Student>list) {
		Predicate<Student>p = s -> s.getMark()>=75;
		Function<Student,String>f = s->{
			if(s.getMark()>=75) {
				return "A (Destinction)";
			}else if(s.getMark()<=75 || s.getMark()>=66.6) {
				return "B (First Class)";
			}else if(s.getMark()<66.6 || s.getMark()>=58) {
				return "C (Second class)";
			}else if(s.getMark()>58 || s.getMark()>=50) {
				return "D (Third Class)";
			}else if(s.getMark()>50 || s.getMark()<=35) {
				return "E (Pass Class)";
			}else {
				return "F (Failed)";
			}
		};
		for(Student s:list) {
			if(p.test(s)) {
				System.out.println("################################################");
				System.out.println("## Student name:  || "+s.getStdname()+  "||" );
				System.out.println("## Student marks: || "+s.getMark()  +  "||");
				System.out.println("## Grade:         || "+f.apply(s)     + "||");
				System.out.println("################################################");
			}
		}
	}
}
