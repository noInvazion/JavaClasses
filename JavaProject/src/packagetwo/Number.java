package packagetwo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Number {
	int num1, num2;
	static Scanner sc = new Scanner(System.in);

	static int getNum(String prompt) {
		System.out.print(prompt + ">> ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			String line = sc.next();
			int num1 = getNum("Num1: ");
			int num2 = getNum("Num2: ");

			int size = getNum("Array size: ");
			int[] arr = new int[size];

			int size1 = getNum("What index would you like to check: ");
			int storeArray = getNum("enter a value: ");
			arr[size1] = storeArray;

			System.out.format("%d + %d = %d\n", num1, num2, num1 + num2);

			System.out.format("%d - %d = %d\n", num1, num2, num1 - num2);

			System.out.format("%d / %d = %d\n", num1, num2, num1 / num2);

			System.out.format("%d * %d = %d\n", num1, num2, num1 * num2);
		} catch (NumberFormatException ac) {
			System.err.println("NumberFormat Error occurred." + ac.getMessage());
		} catch (ArithmeticException ac) {
			System.out.println("Arithmetic Error occurred." + ac.getMessage());
		} catch (InputMismatchException ac) {
			System.err.println("InputMismatch Error occurred." + ac.getMessage());
		} catch (NegativeArraySizeException ac) {
			System.err.println("Negative value for array");
		} catch (ArrayIndexOutOfBoundsException ac) {
			System.err.println("Negative value for array");
		} finally {
			System.out.println("Would run whether there is an error or not!");
		}

		System.out.println("end");
	}
}
