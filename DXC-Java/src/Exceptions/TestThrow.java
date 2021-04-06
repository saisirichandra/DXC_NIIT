package Exceptions;
//import java.io.*;  
class M{  
	void method()throws ArithmeticException{  
		throw new ArithmeticException("error in code");  
	}  
}  
class TestThrow{  
	public static void main(String args[])throws ArithmeticException {//declare exception  
		M m=new M();
		int k=10/0;
	    m.method();  

		System.out.println("normal flow...");  
	}  
}  
