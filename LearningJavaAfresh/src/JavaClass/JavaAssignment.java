package JavaClass;

import java.util.Scanner;
import java.util.Arrays;

public class JavaAssignment {

	Scanner sc = new Scanner(System.in);

	void greetUser() {
		String name = "Arne Slot";
		System.out.println("Hello\n" + name);
	}

	void productNumbers() {
		int num1, num2, result;
		System.out.print("Enter the first number: ");
		num1 = sc.nextInt();
		sc.close();
		System.out.print("Enter the second number: ");
		num2 = sc.nextInt();
		sc.close();

		result = num1 * num2;
		System.out.printf("%d * %d = %d", num1, num2, result);
	}

	void arithmeticOperators() {
		int num1, num2, result;

		System.out.print("Enter the first number:");
		num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		num2 = sc.nextInt();
		sc.close();

		result = num1 + num2;
		System.out.println("The result is " + result);
	}

	public static void main(String[] args) {

		JavaAssignment jv = new JavaAssignment();
//		jv.greetUser();
//		jv.productNumbers();
//		jv.arithmeticOperators();

		LoopsAssignment assignment = new LoopsAssignment();
//		System.out.println(assignment.userInput());
//		assignment.repeatedHello();
//		System.out.println(assignment.courses());
//		assignment.oddEven();
//		assignment.starDesign();
//		assignment.fizzBuzz();
//		assignment.sumOfMultiples();
//		assignment.reverseUserArray();
//		assignment.reverseArray();
		assignment.duplicateArray();
		assignment.sortedArray();
		assignment.removeDuplicate();
	}
}

class LoopsAssignment {

	Scanner details = new Scanner(System.in);

	String userInput() {

		System.out.print("Enter your first name:");
		String firstName = details.nextLine();

		System.out.print("Enter your last name:");
		String lastName = details.nextLine();

		System.out.print("Enter your age:");
		byte age = details.nextByte();

		return "Hi, my name is " + firstName + " " + lastName + ".I am " + age + " years old.";
	}

	void repeatedHello() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello");
		}
	}

	String courses() {
		System.out.print("How old are you:");
		int age = details.nextInt();

		if (age < 5) {
			return ("You are not eligible to take this course!");
		} else {
			return ("Welcome! You are eligible to take this course!");
		}
	}

	void oddEven() {
		for (int i = 0; i <= 15; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d is an even number.\n", i);
			} else {
				System.out.printf("%d is an odd number.\n", i);
			}
		}

		System.out.println();
	}

	void starDesign() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	void fizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		System.out.println();
	}

	void sumOfMultiples() {
		int total = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				total += i;
				System.out.printf("%d is a multiple of 3 and 5.\n", i);
			}
		}
		System.out.println("No other multiple of 3 and 5 exist (between 1 - 100)");
		System.out.printf("The sum of the multiples gives %d.", total);
	}

	void reverseUserArray() {

		char[][] userArray = new char[3][2];
		int entry = 0;
		int increment = 0;

		while (entry < userArray.length - 1) {
			char[] getArray = new char[4];

			for (int i = 0; i < getArray.length; i++) {
				System.out.print("Enter a character>>");
				char letter = details.nextLine().charAt(0);

				getArray[i] = letter;
			}

			for (int array = 0; array < getArray.length; array++) {
				System.out.print(getArray[array]);
			}

			System.out.println();

			// To find the reversed array
			char[] getArray2 = new char[getArray.length];

			int counter = 0;

			for (int i = getArray2.length - 1; i >= 0; i--) {
				getArray2[counter] = getArray[i];

				counter++;
			}

			for (int array = 0; array < getArray2.length; array++) {
				System.out.print(getArray2[array]);
			}

			System.out.println();

			// Set the multidimensional array

			increment++;

			userArray[entry] = getArray;
			userArray[entry + 1] = getArray2; // issues with this

			entry++;
		}

		// Print the array
		System.out.println();
		for (int i = 0; i < userArray.length; i++) {
			System.out.println(userArray[i]);
		}

	}

	void reverseArray() {
		int[][] numArray = new int[2][3];

		int innerCounter = 0;
		for (int counter = 0; counter < numArray.length + 1; counter++) {
			System.out.print("Enter a number>>");
			int num = details.nextInt();

			numArray[0][innerCounter] = num;
			innerCounter++;
		}
		// Reverse the array

		int index = 0;

		for (int i = numArray.length; i >= 0; i--) {
			int numReversed = numArray[0][i];

			numArray[1][index] = numReversed;
			index++;
		}

		System.out.println(Arrays.deepToString(numArray));

	}

	
	void duplicateArray() {
		System.out.println("1. Duplicate, Unique, Reversed.");

		int[] numArray = { 2, 15, 4, 2, 8, 40, 15, 40 };

		int[][] multNumArray = new int[3][3]; // ask about this... didnt know the size of the column
		int counter = 0;

		// Getting Duplicate Values
		for (int i = 0; i < numArray.length; i++) {
			int valueAtArray = numArray[i];

			// Compare with all items in the list

			for (int count = i + 1; count < numArray.length; count++) {
				if (valueAtArray == numArray[count]) {
					multNumArray[0][counter] = valueAtArray;
					counter++;
					break;
				}
			}
		}

		// Getting Unique Values
		counter = 0;
		for (int i = 0; i < numArray.length; i++) {
			int num = numArray[i];

			for (int j = i + 1; j < numArray.length; j++) {

			}

		}

		System.out.println(Arrays.deepToString(multNumArray));
	}

	void sortedArray() {
		System.out.println();
		System.out.println("2.Sorting the array.");
		int[] numArray = { 1, 2, 3, 1, 4, 5, 4, 6, 2};

		for (int i = 0; i < numArray.length - 1; i++) {
			for (int j = 0; j < numArray.length - 1 - i; j++) {
				if (numArray[j] > numArray[j + 1]) {
					int max = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = max;
				}
			}
		}

		System.out.println(Arrays.toString(numArray));

	}

	void removeDuplicate() {
		System.out.println();
		System.out.println("3.Removing duplicate from the array.");
		int[] numArray = { 4, 1, 4, 7, 5, 1, 5, 4 };
		int count = 0;

		System.out.println(Arrays.toString(numArray));
		System.out.print("Enter number to remove>>");
		int userNum = details.nextInt();

		int counter = 0;
		for (int num : numArray) {
			if (num != userNum) {
				counter++;
			}
		}

		int[] userDuplicate = new int[counter];

		for (int i = 0; i < numArray.length; i++) {
			int num = numArray[i];
			if (num == userNum) {
				continue;
			} else if (num != userNum) {
				userDuplicate[count] = num;
				count++;
			}
		}

		System.out.println(Arrays.toString(userDuplicate));

	}

}
