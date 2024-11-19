package packageone;

interface Tommy{
	public static final int num = 5; 
//	Variables in an interface are public static final
}

public class Interface implements Tommy2{
	static void Calculator() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Calculator();
	}
	
}

/*
 * A concrete method in an interface must always have a body (curly braces)
 * Interface can contain static and default methods, including the main method which is static.
 */
