package Predefined_Package;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Employeetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeetest et = new Employeetest();
		ArrayList<Employee>list = new ArrayList<Employee>();
		et.populate(list);
		System.out.println(list);
		et.populateForisEqual(list);
		Employee em = new Employee();
		System.out.println("Employee whose designation is Manager");
		Predicate<Employee>p1 = (emp)->emp.getDesignation().equals("Manager");
		em.Display(p1,list);
		System.out.println("Employee whose City is Pune");
		Predicate<Employee>p2 =(emp)->emp.getCity().equals("Pune");
		em.Display(p2, list);
		System.out.println("Employee whose salary is less than 20000");
		Predicate<Employee>p3 = (emp)->emp.getSalary()<20000;
		em.Display(p3, list);
		System.out.println("Employee whose designation is manager and city pune");
		em.Display(p1.and(p2), list);
		System.out.println("Employee whose designation is manager or salary is leass than 20000");
		em.Display(p1.or(p3).and(p2), list);
		System.out.println("Employee who is not manager");
		em.Display(p1.negate(), list);
		System.out.println("Employee whose designation is CEO");
		Predicate<Employee>isCEO = Predicate.isEqual(new Employee("Nikita","Banglore","CEO",100000));
		em.DisplaiIsEqual(isCEO,list);
	}
//	private void populate(ArrayList<Employee> list) {
//		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		for (int i = 0; i < 5; i++) {
//			Employee e = new Employee();
//			System.out.println("Enter employee name:");
//			e.setEmpname(sc.next());
//			System.out.println("Enter employee City:");
//			e.setCity(sc.next());
//			System.out.println("Enter employee Designation:");
//			e.setDesignation(sc.next());
//			System.out.println("Enter the Salary:");
//			e.setSalary(sc.nextDouble());
//			list.add(e);
//		}
//	}
	
	private static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Nilesh","Pune","Manager",50000));
		list.add(new Employee("Sakshi","Mumbai","lead",40000));
		list.add(new Employee("karan","Pune","Developer",30000));
		list.add(new Employee("Pooja","Pune","QA",30000));
		list.add(new Employee("Vandana","Pune","Manager",50000));
		list.add(new Employee("Chirag","Delhi","lead",30000));
		list.add(new Employee("Amol","Mumbai","Engineer",10000));
		list.add(new Employee("Leea","Mumbai","Qa",10000));
		list.add(new Employee("Reetha","Pune","Qa",10000));
		list.add(new Employee("Ram","Mumbai","Lead",4000));
		list.add(new Employee("farhan","Delhi","Developer",35000));
		list.add(new Employee("Ashin","Chennai","Engineer",10000));
		list.add(new Employee("Rakhi","Cehnnai","Developer",25000));
		list.add(new Employee("Hina","Bangalore","Manager",70000));

	}
	private static void populateForisEqual(ArrayList<Employee> list) {
		list.add(new Employee("Nilesh","Pune","Manager",50000));
		list.add(new Employee("Sakshi","Mumbai","lead",40000));
		list.add(new Employee("karan","Pune","Developer",30000));
		list.add(new Employee("Pooja","Pune","QA",30000));
		list.add(new Employee("Vandana","Pune","Manager",50000));
		list.add(new Employee("Chirag","Delhi","lead",30000));
		list.add(new Employee("Amol","Mumbai","Engineer",10000));
		list.add(new Employee("Leea","Mumbai","Qa",10000));
		list.add(new Employee("Reetha","Pune","Qa",10000));
		list.add(new Employee("Ram","Mumbai","Lead",4000));
		list.add(new Employee("farhan","Delhi","Developer",35000));
		list.add(new Employee("Ashin","Chennai","Engineer",10000));
		list.add(new Employee("Rakhi","Cehnnai","Developer",25000));
		list.add(new Employee("Hina","Bangalore","Manager",70000));
		list.add(new Employee("Nikita","Banglore","CEO",100000));

	}

}
