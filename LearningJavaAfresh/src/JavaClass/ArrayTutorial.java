package JavaClass;

import java.util.Random;
import java.util.Scanner;

public class ArrayTutorial {
	
	void reverseArray() {
		int originalArray [] = {32, 31, 40, 23, 15, 90};
		
		System.out.println();
		
		int reversedArray [] = new int[originalArray.length];
		int i = 0;
		for (int index = originalArray.length - 1; index >= 0; index--) {
			
			reversedArray[i] = originalArray[index];
			i++;
			}
		
		for(int number: reversedArray) {
			System.out.println(number);
		}
		
		
	}
	
	void arrayLearn() {
		int scores[] = new int [5];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = i;
//			System.out.print(scores[i]);
		}
		
		for(int y: scores) {
			System.out.print(scores[y]);
		}
		
		System.out.println();
		
		int index = 0;
		
		while (index < scores.length) {
			
			
			System.out.print(scores[index]);
			
			index++;
		}
		
		System.out.println();
		
//		do {
//			System.out.print(scores[index]);
//			index++;
//		} while (index < scores.length);
	}
	
	void arrayString() {
		Scanner sc = new Scanner(System.in);
		String word = "";
		String [] array = {"Welcome", "", "!!"};
		
		System.out.print("Enter your name before you play>>>");
		
		String name = sc.nextLine();
		
		array[1] = name;
		String copyWord = "";
		for (int count = 0; count < array.length; count++) {
			
			copyWord = array[count];
			if (count < array.length - 1) {
				word = word + copyWord + " ";
			} else {
				word += copyWord;
//				break;
			}
		}
		
		System.out.print(word);
	}
	
	

	public static void main(String[] args) {
		
		ArrayTutorial arr = new ArrayTutorial();
////		arr.arrayLearn();
//		arr.reverseArray();
		arr.arrayString();
		
		
		
	}
}

class EnumClass{
	
	enum salaryPayments {
		Manager(5000), Security(2500), Teachers(3500);
		
		int salary;
		salaryPayments(int amount){
			amount = salary;
		}
	
	int getSalary() {
		return salary;
	}
	
	}
}

