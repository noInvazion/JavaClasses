package JavaClass;

import java.util.Scanner;
import java.util.Arrays;

//  Write a Java program to calculate the average value of array elements

public class ProblemStatement {
	Scanner sc = new Scanner(System.in);

	int[] numbers = { 5, 7, 3, 1, 10, 5 };

	String[] names = { "Alex", "Tommy", "AJ", "Kevin", "Alex", "Dave", "Tommy", "AJ" };

	int sumArray() {

		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}

		return sum;

	}

	void gridDashes() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.print("- ");
			}
			System.out.println();
		}
	}

	int averageValue() {
		int sumOfArrays = sumArray();
		return sumOfArrays / 2;
	}

	void arrayCheck() {
		System.out.println(Arrays.toString(numbers));
		System.out.print("Check Number(if it exists)>>");
		int userNum = sc.nextInt();
		boolean checkExists = false;
		for (int i = 0; i < numbers.length; i++) {
			if (userNum == numbers[i]) {
				checkExists = true;
				System.out.printf("The number %d exists.\n", userNum);
				break;
			} else {
				checkExists = false;
			}
		}

		if (checkExists == false) {
			System.out.printf("The number %d does not exist.", userNum);
		}
	}

	void indexArray() {
		System.out.println(Arrays.toString(numbers));
		System.out.print("Number(and get element)>>");
		int userNum = sc.nextInt();
		boolean checkExists = false;
		for (int i = 0; i < numbers.length; i++) {
			if (userNum == numbers[i]) {
				checkExists = true;
				System.out.printf("The number %d exists at index %d.\n", userNum, i);
				break;
			} else {
				checkExists = false;
			}
		}

		if (checkExists == false) {
			System.out.printf("The number %d does not exist.", userNum);
		}

	}

	void removeElement() {
		// String array, remove by index or value
		String[] letters = { "a", "b", "g", "e", "w", "b" };
		System.out.println(Arrays.toString(letters));
		System.out.print("Remove by index or value (1 or 2)>>");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.print("Enter index>>");
			int userIndex = sc.nextInt();
			if (userIndex < letters.length) {
				letters[userIndex] = "";
			} else {
				System.out.println("Invalid index.");
			}
			System.out.println(Arrays.toString(letters));
			break;
		case 2:
			boolean checkValue = false;
			System.out.print("Enter value>>");
			String userValue = sc.next();
			for (int i = 0; i < letters.length; i++) {
				if (userValue.equals(letters[i])) {
					checkValue = true;
					letters[i] = "";
				} else {
					checkValue = false;
				}
			}

			if (checkValue == false) {
				System.out.println("Invalid Value!");
			}
			System.out.println(Arrays.toString(letters));
			break;
		}
	}

	void copyArray() {
		int[] numbersClone = new int[numbers.length];
		int i = 0;
		for (int num : numbers) {
			numbersClone[i] = num;
			i++;
		}

		System.out.println("Numbers Array:" + Arrays.toString(numbers));
		System.out.println("Numbers Array Clone: " + Arrays.toString(numbersClone));
	}

	void insertValue() {
		System.out.println(Arrays.toString(numbers));
		System.out.print("Enter a value>>");
		int userValue = sc.nextInt();
		System.out.print("Enter an index>>");
		int userIndex = sc.nextInt();
		if (userIndex <= numbers.length + 1) {
			numbers[userIndex] = userValue;
		} else {
			System.out.println("Invalid index");
		}

		System.out.println(Arrays.toString(numbers)); // doesn't actually inserts, just replaces...
	}

	void rangeArray() {
		System.out.println(Arrays.toString(numbers));
		boolean checkMax = false;
		int max = numbers[0];
		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}

		System.out.println("Max Number>>" + max);
		System.out.println("Min Number>>" + min);
	}

	void reverseArray() {
		int[] numbersReversed = new int[numbers.length];
		int count = numbers.length - 1;
		for (int i = 0; i < numbers.length; i++) {
			numbersReversed[i] = numbers[count];
			count--;

		}
		System.out.println("Numbers Array:" + Arrays.toString(numbers));
		System.out.println("Numbers Reversed Array:" + Arrays.toString(numbersReversed));
	}

	void duplicateInt() {
		boolean dupValue = false;
		int[] numbers2 = { 1, 2, 5, 10, 5, 7, 2, 1, 7 };
		int[] dupNumbers = new int[numbers2.length / 2];
		int count = 0;

		for (int i = 0; i < numbers2.length; i++) {
			for (int j = i + 1; j < numbers2.length; j++) {
				if (numbers2[i] == numbers2[j]) {
					dupValue = true;
					dupNumbers[count] = numbers2[i];
					count++;
					break;
				} else {
					dupValue = false;
				}
			}
		}

		System.out.println("Numbers Array:" + Arrays.toString(numbers2));
		System.out.println("Duplicate Numbers Array:" + Arrays.toString(dupNumbers));

	}

	void dupString() {
		boolean dupValue = false;
		String[] dupStrings = new String[names.length / 2];
		int count = 0;

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					dupValue = true;
					dupStrings[count] = names[i];
					count++;
					break;
				} else {
					dupValue = false;
				}
			}
		}

		System.out.println("Numbers Array:" + Arrays.toString(names));
		System.out.println("Duplicate Numbers Array:" + Arrays.toString(dupStrings));

	}

	void commonString() {
//		Write a Java program to find common elements between two arrays (string values).

		String[] secondNames = { "May", "Jake", "Kevin", "AJ", "Tommy", "Uso" };

		boolean checkCommon = false;
		int maxArrayLength = 0;
		int count = 0;

		if (names.length >= secondNames.length) {
			maxArrayLength = names.length;
		} else {
			maxArrayLength = secondNames.length;
		}

		String[] commonNames = new String[maxArrayLength];

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < secondNames.length; j++) {
				if (names[i].equals(secondNames[j])) {
					checkCommon = true;
					commonNames[count] = names[i];
					count++;
					break;
				} else {
					checkCommon = false;
				}
			}
		}
		System.out.println("First Name Array:" + Arrays.toString(names));
		System.out.println("Second Name Array:" + Arrays.toString(secondNames));
		System.out.println("Common Names: " + Arrays.toString(commonNames));

//		maybe use non-duplicate values in the array.. or complicate the code to fix duplicate 

	}

	void commonInteger() {
//		Write a Java program to find common elements between two integer arrays.

		int[] realNumber = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] evenNumbers = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		boolean checkCommon = false;
		int maxArrayLength = 0;
		int count = 0;

		if (realNumber.length >= evenNumbers.length) {
			maxArrayLength = realNumber.length;
		} else {
			maxArrayLength = evenNumbers.length;
		}

		int[] commonNumbers = new int[maxArrayLength / 2];

		for (int i = 0; i < realNumber.length; i++) {
			for (int j = 0; j < evenNumbers.length; j++) {
				if (realNumber[i] == (evenNumbers[j])) {
					checkCommon = true;
					commonNumbers[count] = realNumber[i];
					count++;
					break;
				} else {
					checkCommon = false;
				}
			}
		}
		System.out.println("First Name Array:" + Arrays.toString(realNumber));
		System.out.println("Second Name Array:" + Arrays.toString(evenNumbers));
		System.out.println("Common Names: " + Arrays.toString(commonNumbers));

	}

	void secondLargest() {
//		Write a Java program to find the second largest element in an array.
		System.out.println(Arrays.toString(numbers));
		boolean checkSecondMax = false;
		int max = numbers[0];
		int secondNumber = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != max && numbers[i] > secondNumber) {
				secondNumber = numbers[i];
				checkSecondMax = true;
			}
		}

		System.out.println("Max Second Number>>" + secondNumber);
	}

	public static void main(String[] args) {
		ProblemStatement pro = new ProblemStatement();
		int sumOfArray = pro.sumArray();
		int averageArray = pro.averageValue();
		System.out.printf("The sum of the array is %d\n", sumOfArray);
		System.out.printf("The average sum of the array is %d\n", averageArray);
		pro.gridDashes();
		pro.arrayCheck();
		pro.indexArray();
		pro.removeElement();
		pro.copyArray();
		pro.insertValue();
		pro.rangeArray();
		pro.reverseArray();
		pro.duplicateInt();
		pro.dupString();
		pro.commonString();
		pro.commonInteger();
		pro.secondLargest();

	}

}
