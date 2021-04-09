package LambdaExp;

public class FunInter2 {
public static void main(String[] args) {
	FunInterface f=(a,b) -> (a+b);
	System.out.println(f.sum(10,20));
}
}
