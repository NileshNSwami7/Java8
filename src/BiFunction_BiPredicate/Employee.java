package BiFunction_BiPredicate;

import java.util.ArrayList;

public class Employee {
	
	private String empid;
	private String ename;
	private double dailyweige;
	public Employee() {
		super();
	}
	
	public Employee(String empid, double dailyweige) {
		super();
		this.empid = empid;
		this.dailyweige = dailyweige;
	}

	public Employee(String empid, String ename, double dailyweige) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.dailyweige = dailyweige;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getDailyweige() {
		return dailyweige;
	}
	public void setDailyweige(double dailyweige) {
		this.dailyweige = dailyweige;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", dailyweige=" + dailyweige + "]";
	}
	
	public ArrayList<Employee> populate(){
		ArrayList<Employee>list = new ArrayList<>();
		list.add(new Employee("IN01705","Nilesh",1800));
		list.add(new Employee("IN01707","Tripti",2000));
		list.add(new Employee("IN01703","Irani",3000));
		list.add(new Employee("IN01702","kajal",1200));
		list.add(new Employee("IN01706","pavan",2000));
		list.add(new Employee("IN01708","leena",2500));
		list.add(new Employee("IN01709","Ravina",1400));
		list.add(new Employee("IN01701","Tushar",15000));
		list.add(new Employee("IN01710","Mahesh",2000));
		list.add(new Employee("IN01711","Shardhha",12000));
		return list;
	}
}
