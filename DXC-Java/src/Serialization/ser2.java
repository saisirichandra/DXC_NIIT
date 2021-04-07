package Serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ser2 {

	public static void main(String[] args) {
		Transient T1 = new Transient();
		//serialization
		try {
			FileOutputStream fos = new FileOutputStream("dxc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(T1);
		} catch (IOException e) {	e.printStackTrace();	}

		//de-serialization

		FileInputStream fis;
		try {
			fis = new FileInputStream("dxc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Transient T2 = (Transient)ois.readObject();
			System.out.println(T2.k +"\t"+ T2.j);

		} catch (FileNotFoundException e) {			e.printStackTrace();} 
		catch (IOException e) {			e.printStackTrace();	} 
		catch (ClassNotFoundException e) {			e.printStackTrace();		}

	}
}