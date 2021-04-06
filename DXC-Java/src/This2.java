
public class This2 {

	int id;  	
	String name;  
	This2(int i,String n){  
		id = i;  
		name = n;  
	}  
	This2(){




	}






	void display(){System.out.println(id+" "+name);}  

	public static void main(String args[]){  
		This2 s1 = new This2(111,"Karan");  
		This2 s2 = new This2();  

		s1.display();  
		s2.display();  
	}  
}
