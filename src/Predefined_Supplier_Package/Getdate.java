package Predefined_Supplier_Package;

import java.util.Date;
import java.util.function.Supplier;

public class Getdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date>s = ()->new Date();
		System.out.println(s.get());
	}

}
