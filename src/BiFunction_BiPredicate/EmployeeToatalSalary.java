package BiFunction_BiPredicate;

import java.util.Scanner;
import java.util.function.BiFunction;

public class EmployeeToatalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BiFunction<Employee,Timesheet,Double> bf = (e,t)-> e.getDailyweige() * t.getNoofdays();
		Employee e = new Employee("IN01705","Nilesh",1500);
		Timesheet t = new Timesheet("IN01705",30);
		System.out.println("Monthly Salary : "+bf.apply(e,t));
		
	}

}
