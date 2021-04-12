package InbuiltFI;

import java.util.function.BiFunction;

public class BIFun {public static void main(String[] args) {
	BiFunction< Integer, String, Employee> bif = (i,s) -> new Employee(s, i);
	
	Employee e = bif.apply(1234, "abdul");
	System.out.println(e.employee);
}

}
