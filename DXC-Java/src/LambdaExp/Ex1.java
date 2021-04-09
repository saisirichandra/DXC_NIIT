package LambdaExp;

import java.util.function.Function;

public class Ex1 {
public static void main(String[] args) {
	int j=4;
	Function<Integer,Integer> f=i->i*i;
	System.out.println(f.apply(j));
}
}
