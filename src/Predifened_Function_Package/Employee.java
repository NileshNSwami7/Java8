package Predifened_Function_Package;

import java.util.ArrayList;

public class Employee {
	
	private String ename;
	private double salary;
	public Employee(String ename, double salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public ArrayList<Employee> getList() {
		return list;
	}
	public void setList(ArrayList<Employee> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "ename:= " + ename + ", salary:= " + salary;
	}
	
	ArrayList<Employee>list = new ArrayList<>();
	public ArrayList<Employee>popuplate(){
		list.add(new Employee("Nilesh",58000));
		list.add(new Employee("Tripti",40000));
		list.add(new Employee("Irani",39000));
		list.add(new Employee("kajal",37000));
		list.add(new Employee("pavan",47000));
		list.add(new Employee("leena",25000));
		list.add(new Employee("Ravina",40000));
		list.add(new Employee("Tushar",35000));
		list.add(new Employee("Mahesh",20000));
		list.add(new Employee("Shardhha",35000));
		return list;
	}
}
