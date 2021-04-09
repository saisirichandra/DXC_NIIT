package InbuiltFI;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo {
	static ArrayList<JavaStudent> javaStudents = Test.populateStudents();
	
	public static void main(String[] args) {
		Consumer<JavaStudent> c = s -> System.out.println(s.name);
		
		for(JavaStudent student: javaStudents) {
			c.accept(student);
		}
	}

}

