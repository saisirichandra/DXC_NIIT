package Exceptions;

public class ExplicitThrow {
  
	public static void main(String args[]){ 
		int age=12;
		if(age<18)  
			throw new ArithmeticException("Can't Vote");  
		else  
			System.out.println("welcome to vote");   
		System.out.println("rest of the code...");  
	}  
}  