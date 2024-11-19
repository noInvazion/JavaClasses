package tutorial;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class tutorial1 {

	public static void main(String[] args) {
		
//		Random rand = new Random();
//		
//		int x = rand.nextInt(6);
//		
//		double y = rand.nextDouble();
//		
//		boolean z = rand.nextBoolean();
//		
//		System.out.println(x);
		
		String name = "Tommy";
		//PRINTF METHOD
		//[width]
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		
//		
		String[] car = new String[3]; // creates array of 3 elements
		car[0] = "BMW";
		car[1] = "Benz";
		car[2] = "Mustang";;
		
		for(String i : car) {
			System.out.println(i);
		} // for-each loop is used to iterate through elements in an iterable

//		bmiCalc bmi = new bmiCalc();
//		bmi.getWeight();
//		bmi.getHeight();
//		bmi.calcBMI();
//		bmi.bmiresults();

		pattern pat = new pattern();
		pat.starPattern();
	}
}

class bmiCalc {
	double weight;
	double height;

	double bmi = weight / height;

	void getWeight() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight: ");
		weight = sc.nextDouble();
	}

	void getHeight() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your height: ");
		height = sc.nextDouble();
	}

	void calcBMI() {
		bmi = weight / height;
		System.out.println("Your BMI is " + bmi);
	}

	void bmiresults() {
		if (bmi <= 30) {
			System.out.println("Underweight!");
		} else if (bmi <= 50) {
			System.out.println("Normal!");
		} else if (bmi <= 80) {
			System.out.println("Overweight!");
		} else if (bmi < 100) {
			System.out.println("Obese!");
		}
	}

}

class pattern {
	void starPattern() {
		for (int star = 4; star >= 0; star--) {
			for (int j = star; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
