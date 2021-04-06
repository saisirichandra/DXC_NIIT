package Exceptions;

import java.io.IOException;

public class TestExceptPorpagation {


	void m() throws IOException{  
		throw new java.io.IOException("device error");//checked exception  
	}  
	void n() throws IOException{  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){System.out.println("exception handeled");}  
	}  
	public static void main(String args[]){  
		TestExceptPorpagation obj=new TestExceptPorpagation();  
		obj.p();  
		System.out.println("normal flow");  
	}  
}  