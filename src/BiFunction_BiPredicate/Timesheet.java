package BiFunction_BiPredicate;

public class Timesheet {
	
	private String empid;
	private double noofdays;
	public Timesheet() {
		super();
	}
	public Timesheet(String empid, double noofdays) {
		super();
		this.empid = empid;
		this.noofdays = noofdays;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public double getNoofdays() {
		return noofdays;
	}
	public void setNoofdays(double noofdays) {
		this.noofdays = noofdays;
	}
	@Override
	public String toString() {
		return "Timesheet [empid=" + empid + ", noofdays=" + noofdays + "]";
	}
	
	
}
