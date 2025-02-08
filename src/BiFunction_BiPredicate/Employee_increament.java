package BiFunction_BiPredicate;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Employee_increament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeeincremnet e = new Employeeincremnet();
		ArrayList<Employeeincremnet> list = e.populate();
		ArrayList<Employeeincremnet>al = new ArrayList<Employeeincremnet>();
		
		
		BiFunction<String, Double, Employeeincremnet> bf = (n, s) -> new Employeeincremnet(n, s);
		for (Employeeincremnet em : e.populate()) {
			al.add(bf.apply(em.getEmpid(), em.getDailyweige()));
		}

		BiConsumer<Employeeincremnet, Double> cb = (e2, increment) -> {
			double salary =e2.getDailyweige() + increment;
			System.out.println("###########################################");
			System.out.println("Employee Id: " + e2.getEmpid());
//			System.out.println("Employee Name: " + e2.getEname());
			System.out.println("Employee Salary before increment: "+e2.getDailyweige());
			System.out.println("Employee Salary: " + salary);
			System.out.println("###########################################");
		};
		BiPredicate<Employeeincremnet, Double> bp = (s,d) -> s.getDailyweige() <= 1500.0;

		for (Employeeincremnet e2 :al ) {
			if (bp.test(e2, 1200.0)) {
				cb.accept(e2, 300.0);
			}else {
				cb.accept(e2, 0.0);
			}
		}
	}
}
