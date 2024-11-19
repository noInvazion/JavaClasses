package packagetwo;
import java.util.InputMismatchException;

public class Exception3 {
	public static void main(String[] args) {
		try {
		Exception3 obj1 = new Exception3();
//		obj1.error();
		try {
			System.out.println(1);
			obj1.error();
			System.out.println(2);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic ex");
			throw ae;
		}
		System.out.println(3);
	} catch (ArithmeticException ime) {
		System.out.println("Arithmetic Exception");
	}
	System.out.println(4);
		
	}
//		throws InterruptedException {
//			
//		System.out.println("Start");
//		Thread.sleep(3000);
//		System.out.println("End");
//	}
	
	void error() {
		System.out.println("Hello");
		throw new ArithmeticException("Eniola is !smart"); // throw calls out an error and passes the message contained in our parenthesis
		//throw is used to cause an error, throws is used to inform the method about an error
	}
}
