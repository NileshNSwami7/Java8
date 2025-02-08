package Predicates_and_Function;

public class Passenger {
	
	private int passengerid;
	private String passengername;
	private String address;
	private double charges;
	private String pass;
	private String email;
	private String mobile;
	private int age;
	
	public int getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Passenger() {
		super();
	}
	
	public Passenger(String passengername, String pass, String email, String mobile) {
		super();
		this.passengername = passengername;
		this.pass = pass;
		this.email = email;
		this.mobile = mobile;
	}
	public Passenger(int passengerid, String passengername, String address, double charges, String pass, String email,
			String mobile, int age) {
		super();
		this.passengerid = passengerid;
		this.passengername = passengername;
		this.address = address;
		this.charges = charges;
		this.pass = pass;
		this.email = email;
		this.mobile = mobile;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Passenger [passengerid=" + passengerid + ", passengername=" + passengername + ", address=" + address
				+ ", charges=" + charges + ", pass=" + pass + ", email=" + email + ", mobile=" + mobile + ", age=" + age
				+ "]";
	}
	
	
	
}
