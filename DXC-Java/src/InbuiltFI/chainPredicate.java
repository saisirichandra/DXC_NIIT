package InbuiltFI;

import java.util.function.Predicate;

public class chainPredicate {
	public static void main(String[] args) {
		Predicate<Integer> f1 = i->i%2==0;
		Predicate<Integer> f2 = i->i>=10;
		int[] array = {10,221,32,11,15,51,71,106};
		for(int i:array) {
			if(f1.and(f2).test(i))
				System.out.println(i);//no. is even and > =10
		}
		for(int i:array) {
			if(f1.or(f2).test(i))
				System.out.println(i);//no. is even or >=10
		}

	}

}