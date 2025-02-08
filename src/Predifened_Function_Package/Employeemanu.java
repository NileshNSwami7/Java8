package Predifened_Function_Package;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employeemanu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		ArrayList<Employee>list = new ArrayList<>();
		list=e.popuplate();
		for(Employee em:list) {
			System.out.println(em.toString());
		}
		Function<ArrayList<Employee>,Double> f = ls ->{
			double total=0;
			for(Employee emp : ls) {
				total = total + emp.getSalary();
			}
			return total;
		};
		System.out.println("Total salary: "+ f.apply(list));
		 
		System.out.println("Whose Salary less than 30000 :");
		ArrayList<Employee>list1 = new ArrayList<>();
		Predicate<Employee> p = sl ->sl.getSalary()<30000;
		Function<Employee,Employee>F1= s1->{
			s1.setSalary(s1.getSalary()+5000);
			return s1;
		};
		for(Employee e1:list) {
			if(p.test(e1)) {
				System.out.println(e1.toString());
				F1.apply(e1);
				list1.add(e1);
			}
		}
		System.out.println("Salary After increament by 5000");
		for(Employee e3:list1)
		{
			System.out.println(e3);
		}
		
	}

}
