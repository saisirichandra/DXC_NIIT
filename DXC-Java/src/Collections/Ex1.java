package Collections;

public class Ex1 {
	public static void main(String[] args) {  
		char[] arr1 = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
				'i', 'n', 'a', 't', 'e', 'd' };    
		char[] arr2 = new char[7];   
		System.arraycopy(arr1,3, arr2,3,3);   
		System.out.println(String.valueOf(arr2)); 

	}
}
