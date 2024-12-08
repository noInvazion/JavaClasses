package exception;

import java.util.Scanner;

public class CalculatorAssert {

	public CalculatorAssert() {
		getNumbers();
	}

	Scanner sc = new Scanner(System.in);
	int num1, num2, result;
	
	String operatorArray[] = {"/", "+", "-", "*"};

	void getNumbers() {
		System.out.print("Num1>>");
		num1 = sc.nextInt();

		System.out.print("Num2>>");
		num2 = sc.nextInt();

		assert (num1 > 0 && num2 > 0) : "Invalid number.";
		
		chooseOperator();
	}

	void chooseOperator() {
		System.out.print("Operator>>");
		String operator = sc.next();

		if (operator.equalsIgnoreCase("/")) {
			result = num1 / num2;
			System.out.println(result);
		} else if (operator.equalsIgnoreCase("+")) {
			result = num1 + num2;
			System.out.println(result);
		} else if (operator.equalsIgnoreCase("-")) {
			result = num1 - num2;
			System.out.println(result);
		} else if (operator.equalsIgnoreCase("*")) {
			result = num1 * num2;
			System.out.println(result);
		}
		
		boolean checkOp = false;
		
		for (String x: operatorArray) {
			if (x.equals(operator)) {
				checkOp = true;
				break;
			} else {
				checkOp = false;
			}
		}
		
		assert (checkOp == true) : "Invalid Operator";
	}

	public static void main(String[] args) {
		CalculatorAssert calc = new CalculatorAssert();
	}

}

