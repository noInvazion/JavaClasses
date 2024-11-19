package packagetwo;

import java.util.Scanner;
import java.util.InputMismatchException;
//import java.lang.ArrayStoreException;

public class Exception2 {

	void arithmeticOps(int num1, int num2) {
		// set num2 to 0
		try {
			int result = num1/num2;	
		} catch (ArithmeticException ae) {
			System.err.println("Arithmetic exception error occured: " + ae.getMessage());
		}
		
	}
	
	void arrayOps (int size) {
		try {
			int[] marks = new int[size];
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.err.println("Array Index Out Of Bounds Exception occured: " + ai.getMessage());
		} catch (ArrayStoreException ase) {
			System.err.println("Array Store Exception occured: " + ase.getMessage());
		} catch (NegativeArraySizeException nase) {
			System.err.println("Negative Array Size Exception occured: " + nase.getMessage());
		} catch (IllegalArgumentException ill) {
			System.err.println("Illegal Argument Exception occured: " + ill.getMessage());
		}
	}
	
	void getInt() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a num: ");
			int num = sc.nextInt();
			sc.close();
		} catch (NullPointerException np) {
			System.err.println("Null Pointer Exception occured: " + np.getMessage());
		} catch (IllegalArgumentException ill) {
			System.err.println("Illegal Argument Exception occured: " + ill.getMessage());
		}  catch (InputMismatchException nill) {
			System.err.println("Illegal Argument Exception occured: " + nill.getMessage());
		}
	}

	public static void main(String[] args) {
		Exception2 obj = new Exception2();
//		obj.arithmeticOps(15, 0);
//		obj.arrayOps(-1);
		obj.getInt();
		
	}
}
