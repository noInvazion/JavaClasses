package packageone;

import java.util.Arrays;
import java.util.Scanner;
import packageone.ifStatement;

public class ArraysClass {
	String name;
	int age;
	
	public ArraysClass (int age, String theName) {
		this.age = age; // this takes the age in the class
		name = theName;
	}
	
	//equals is hashcode toString
	
	//Annotations
	@Override // enforcing the compiler that this class is existing already
	public String toString() {
		return "name is " + name + " and age is " + age;
	}
	
	public static void main(String[] args) {
		
		
		ArraysClass arr = new ArraysClass(28, "Kaleem");
//		System.out.println();
//		arr.secondArray();
		arr.coursesArray();
//		arr.multiDimArray();
//		arr.startArray();
//		System.out.println(arr.getClass());
//		System.out.println(arr.getClass().getName());
//		System.out.println(arr.getClass().getSimpleName());
	}

	void startArray() {
		int[] nums = { 13, 14, 15, 16, 17, 25 }; // Array declaration
		System.out.println(nums);
		System.out.println(nums.toString());
		nums[1] = 25;
		System.out.println(nums[1]);

		int marks[]; // Array declaration
		marks = new int[] { 13, 14, 15, 16, 17, 25 };

		int[] num2 = new int[4]; // Array declaration and assignment
		System.out.println("Size of " + num2.length);

		System.out.println("Content: " + num2); // invalid method to access array content

		num2[2] = 45;
		num2[3] = 12;
		num2[0] = 23;
		// num2[1] = 73;

		System.out.println("Arrays: " + Arrays.toString(num2));

		System.out.println("Element 1: " + num2[0]);
		System.out.println("Element 2: " + num2[1]);
		System.out.println("Element 3: " + num2[2]);
		System.out.println("Element 4: " + num2[3]);

		for (int i = 0; i < 4; i++) {
			System.out.format("Element at %d: %d\n", i + 1, num2[i]);
		}

		marks = new int[5];

		System.out.println("Size: " + marks.length);
	}

	void multiDimArray() {
		// first square bracket is for row, second square bracket is for the column

		int[][] numbers = new int[3][2];

		numbers[0][0] = 0;
		numbers[0][1] = 1;
		numbers[0][2] = 2;

		numbers[1][0] = 3;
		numbers[1][1] = 4;
		numbers[1][2] = 5;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}

			// Alternatively

			int innerArray[] = numbers[i];
			for (int k = 0; k < innerArray.length; k++) {
				System.out.println(innerArray[k]);
			}
			System.out.println(Arrays.toString(numbers[i]));
		}
		System.out.println(Arrays.deepToString(numbers));
	}

	void coursesArray() {
		System.out.print("Numbers of courses: ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int scoreArray[] = new int[num];
		String courseArray[] = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.print("Name of course: ");
			String course = sc.next();
			courseArray[i] = course.toUpperCase();

			System.out.print("Score: ");
			int score = sc.nextInt();
			if (score > 100) {
				System.err.println("Invalid score...");
			} else if (score < 0) {
				System.err.println("Invalid score...");
				break;
			}
			scoreArray[i] = score;
		}

		int overallScore = 0;

		for (int j = 0; j < num; j++) {
			System.out.format("Score obtained in %s is %d\n", courseArray[j], scoreArray[j]);
			overallScore += scoreArray[j];
		}

		int percentageScore = overallScore / num;

		System.out.println(percentageScore);

		ifStatement obj = new ifStatement();
		obj.checkScore(percentageScore);

	}

	void secondArray() {
		int[] numbers = { 23, 45, 67, 32, 34, 65 };

		// for i in name

		for (int number : numbers) {
			System.out.println(number);
		}

		String[] words = { "a", "adv", "aerty", "erty", "ertyu" };
		// for-each loop -- enhanced for-loop
		for (String l : words) {
			System.out.println(l);
		}

		int[][] area = { { 1, 2, 3 }, { 4, 5, 6 }, { 13, 14, 15 }, { 2, 8, 9 } };

		for (int[] innerArray : area) {
			for (int i : innerArray) {
				System.out.println(i);
			}
		}
	}

	void strangeClass() {
//		ArraysClass arr2 = new ArraysClass();
//		System.out.println("1. " + arr2);
	}
}