package ThreadEx;

public class Thread1  extends Thread  
{    
	public void run()  
	{    
		System.out.println("Thread is running...");    
	}    
	public static void main(String args[])  
	{    
		Thread1 t1=new Thread1();    
		// this will call run() method  
		t1.start();    
	}    
}    


