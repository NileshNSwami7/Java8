package Predefined_Supplier_Package;

import java.util.function.Supplier;

public class Generate_OTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String>s = ()->{
			String otp="";
			for(int i=0;i<6;i++) {
				otp = otp + (int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println("One time password : "+s.get());
	}

}
