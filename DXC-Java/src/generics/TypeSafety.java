package generics;

import java.util.ArrayList;

public class TypeSafety {
	public static void main(String args[]){  
		ArrayList list=new ArrayList(); 
		list.add("Mango");
		list.add("Apple");    
		list.add("Banana");    
		list.add(new Integer(10));    
		String x=(String) list.get(1);
		System.out.println(list); 
		System.out.println(list.get(3));
		System.out.println(x);
	}  
}  


