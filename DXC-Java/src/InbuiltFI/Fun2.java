package InbuiltFI;
import java.util.ArrayList;
import java.util.function.Function;
public class Fun2 {
	public static ArrayList<Students> marks;
	public static void main(String[] args) {
		students();
		Function<Students,String> f= (r) -> {
			if(r.marks>80)
				return "Destinction";
			else if(r.marks >=60)
				return "First Class";
			return "passClass";
		};
	for(Students s:marks) {
		System.out.println(f.apply(s));
	}
	}
		private static void students() {
			marks =new ArrayList<Students>();
			marks.add(new Students("sai",55));
			marks.add(new Students("siri",62));
			marks.add(new Students("chandra",76));
			marks.add(new Students("venu",76));
			marks.add(new Students("ihlet",84));
			marks.add(new Students("ava",75));
			
		}

	}
