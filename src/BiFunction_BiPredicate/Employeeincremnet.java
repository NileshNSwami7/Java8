package BiFunction_BiPredicate;

import java.util.ArrayList;

public class Employeeincremnet {

	private String empid;
	private double dailyweige;
	
	public Employeeincremnet() {
		super();
	}
	
	public Employeeincremnet(String empid, double dailyweige) {
		super();
		this.empid = empid;
		this.dailyweige = dailyweige;
	}

	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
	public double getDailyweige() {
		return dailyweige;
	}
	public void setDailyweige(double dailyweige) {
		this.dailyweige = dailyweige;
	}
	
	
	public ArrayList<Employeeincremnet> populate(){
		ArrayList<Employeeincremnet>list = new ArrayList<>();
		list.add(new Employeeincremnet("IN01705",1800));
		list.add(new Employeeincremnet("IN01707",2000));
		list.add(new Employeeincremnet("IN01703",3000));
		list.add(new Employeeincremnet("IN01702",1200));
		list.add(new Employeeincremnet("IN01706",2000));
		list.add(new Employeeincremnet("IN01708",2500));
		list.add(new Employeeincremnet("IN01709",1400));
		list.add(new Employeeincremnet("IN01701",1500));
		list.add(new Employeeincremnet("IN01710",2000));
		list.add(new Employeeincremnet("IN01711",1200));
		return list;
	}
}
