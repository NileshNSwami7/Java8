package Predefined_Supplier_Package;

import java.util.function.Supplier;

public class Create_Random_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String>s =()->{
			
			String pwd="";
			Supplier<Integer>d =()->(int)(Math.random()*10);
			String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character>c = ()->str.charAt((int)(Math.random()*29));
			for(int i=1;i<=8;i++) {
				if(i%2==0) {
					pwd=pwd+d.get();
				}else {
					pwd=pwd+c.get();
				}
			}
			return pwd;
		};
		System.out.println(s.get());
	}

}
