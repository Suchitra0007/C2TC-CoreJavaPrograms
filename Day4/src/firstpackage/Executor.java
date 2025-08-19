package firstpackage;

public class Executor {
	public static void main(String[] args) {
		Base m = new Base();
		
		m.base();
		m.methodpublic();
		m.methodprotected();
		
		
		System.out.println("Default varaiable"+ m.a);
		System.out.println("Public varaiable" + m.b);
		System.out.println("Protected"+m.d);

		

	}
}
