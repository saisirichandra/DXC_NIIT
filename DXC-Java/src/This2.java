
public class This2 {

	int i;  	
	String n;  
	This2(int i,String n)
	{  
		this.i = i;  
		this.n = n;  
	} 
	public static void main(String args[]){  
		This2 s1 = new This2(111,"Karan");
		This2 s2 = new This2(1,"Ka");
		This2 s3;
		s3=s2;
		System.out.println(s1);
	}  
}
