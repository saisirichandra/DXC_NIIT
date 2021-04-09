package InbuiltFI;

import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		Predicate<Integer> f = i->i%2==0;
		System.out.println(f.test(122));
	}

}
