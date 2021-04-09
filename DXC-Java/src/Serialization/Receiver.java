package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Receiver {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("zoo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Tiger tiger = (Tiger)ois.readObject();
		System.out.println("Tiger variable "+tiger.a);
		
		
	}

}