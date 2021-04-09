package InbuiltFI;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		int j=4;
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(j));
		Function<String,Integer> f1=i->i.length();
		System.out.println(f1.apply("Karthik"));
	}
	}
