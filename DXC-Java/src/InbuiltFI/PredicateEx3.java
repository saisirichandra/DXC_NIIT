package InbuiltFI;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx3 {
public static ArrayList<Student> marks;
public static void main(String[] args) {
	students();
	Predicate<Student> f= r -> (r.s1+r.s2+r.s3)/3>75;
	for(Student s: marks) {
		if(f.test(s)) {
			System.out.println(s.name+" passed exam");
		}
		else {
			System.out.println(s.name+" failed exam");
		}
	}
}
	private static void students() {
		marks =new ArrayList<Student>();
		marks.add(new Student("sai",55,90,75));
		marks.add(new Student("siri",62,81,87));
		marks.add(new Student("chandra",76,74,87));
		marks.add(new Student("venu",76,74,75));
		marks.add(new Student("ihlet",84,92,76));
		marks.add(new Student("ava",75,74,74));
		
	}

}