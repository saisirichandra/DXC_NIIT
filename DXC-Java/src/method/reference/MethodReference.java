package method.reference;

public class MethodReference {
	public static void main(String[] args) {
		Runnable r= MethodReference::m1;
		Thread t=new Thread(r);
		t.start();
		System.out.println("In main class");
		
	}
	public static void m1() {
		System.out.println("in thread");
	}
}
