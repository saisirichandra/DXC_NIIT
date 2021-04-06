package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Link {
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println();
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println();
		Collections.reverse(al);
		System.out.println(al);

		System.out.println(al.indexOf("Ravi"));
	}  
	

}
