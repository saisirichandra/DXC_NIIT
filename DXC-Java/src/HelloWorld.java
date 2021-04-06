
public class HelloWorld {
public static void main(String[] args) {
	int age=20;/*
	if (age<18) {
		System.out.println("not eligible");
	}
	else {
		System.out.println("eligible");
	}
*/
	String out=(age<18)?"not eligible":"eligible";
	System.out.println(out);
}
}
