package ConstructorReference;

public class ConstructorReference {

	public static void main(String[] args) {
		ISample iSample = Sample::new;
		Sample s1 = iSample.get();
	}

}