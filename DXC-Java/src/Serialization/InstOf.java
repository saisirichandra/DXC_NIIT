package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class InstOf {
	
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("animals.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		ois.close();
		
		if(o instanceof Cat) {
			Cat c1 = (Cat)o;
		}
		else if(o instanceof Dog) {
			Dog d1 = (Dog)o;
		}


	}

}