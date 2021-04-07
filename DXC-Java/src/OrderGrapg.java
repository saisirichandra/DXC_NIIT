import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectGraph {
	public static void main(String[] args)throws Exception {
		Dog d1 = new Dog();
		
		FileOutputStream fos = new FileOutputStream("dxc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
	}

}