package Predefined_Supplier_Package;

import java.util.function.Supplier;

public class Random_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String>s = ()->{
			String str[]= {"Sun","Mercury","Venus","Earth","Mars","Jupiter","Saturn","Urenus","Neptune","Pluto"};
			int num = (int) (Math.random() * 9);
			return str[num];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
