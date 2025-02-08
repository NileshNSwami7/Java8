package Predefined_Package;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {

	private String empname;
	private String city;
	private String designation;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String empname, String city, String designation, double salary) {
		super();
		this.empname = empname;
		this.city = city;
		this.designation = designation;
		this.salary = salary;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("||"+" %s "+"||"+" %s "+"||"+" %s "+"||"+" %s "+"||" +"\n", empname, city, designation,salary);
	}

	public void Display(Predicate<Employee> pa, ArrayList<Employee> list) {

		for (Employee e : list) {
			if (pa.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("**************************************************************");
	}
	
	public void DisplaiIsEqual(Predicate<Employee> pa, ArrayList<Employee> list) {

		for (Employee e : list) {
			if (pa.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("**************************************************************");
	}
	
	public boolean equals(Object obj)
	{
		Employee em = (Employee)obj;
		if(empname.equals(em.getEmpname())&&city.equals(em.getCity())
				&&designation.equals(em.getDesignation())&&salary==(em.getSalary())) {
			return true;
		}else {
			return false;
		}
	}
}
