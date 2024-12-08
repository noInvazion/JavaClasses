package exception;

import java.util.Scanner;

public class ExceptionHandling {
	
	void error() throws ArithmeticException {
		int i = 40/0;
	}
	public static void main(String[] args) {
		ExceptionHandling exc = new ExceptionHandling();
		try {
		exc.error();
		} catch (ArithmeticException err) {
			System.err.println(err.getMessage());
		}
		Scanner sc = new Scanner(System.in);
		
		try {
			int i = 5/0;
		} catch(ArithmeticException e) {
			System.out.println("/ by zero");
		} finally {
			System.out.println("Finally: used to declare and close objects eg scanner objects...");
		}
	}
}
