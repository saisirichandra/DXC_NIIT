package InbuiltFI;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx2 {
public static ArrayList<Employee> employees;
public static void main(String[] args) {
	populateEmployees();
	Predicate<Employee> f= e -> e.salary>=10000;
	for(Employee e: employees) {
		if(f.test(e)) {
			System.out.println(e.employee);
		}
	}
}
	private static void populateEmployees() {
		employees =new ArrayList<Employee>();
		employees.add(new Employee("sai",12000));
		employees.add(new Employee("siri",2000));
		employees.add(new Employee("chandra",200000));
		employees.add(new Employee("ihlet",100000));
		employees.add(new Employee("itrups",9000));
		employees.add(new Employee("AVa",12000));
		
	}

}
