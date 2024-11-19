package packageone;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassUnknown {
	String[] countries;
	Random rd;
	int index;
	String country;
	String dashes;
	Scanner sc;
	String letter;

	ClassUnknown() {
		countries = new String[] { "Nigeria", "China", "Kenya", "Canada", "France", "England", "Switzerland" };
		rd = new Random();
		sc = new Scanner(System.in);
	}

	void content() {

		System.out.println(Arrays.toString(countries));

	}

	void getCountry() {
		index = rd.nextInt(countries.length);
		System.out.println(index);

		country = countries[index];
		System.out.println(country);
	}
	
	void generateDashes() {
		getCountry();
		dashes = "";
		for (int i = 0; i < country.length(); i++) 
			dashes += "_ ";
		System.out.println(dashes);
		
	}
	
	void check() {
//		getCountry();
		System.out.print("Enter a letter: ");
		letter = String.valueOf(sc.nextLine().charAt(0));
		boolean condition = false;
		for (char present : country.toCharArray()) {
			if (present == letter.charAt(0)) {
				condition = true;
			}
			else {
				condition = false;
//				System.out.println(condition);
			}
			
		}
		System.out.println(condition);
	}

	public static void main(String[] args) {
		ClassUnknown obj1 = new ClassUnknown();
		obj1.getCountry();
////		obj1.contentArray();
//		for (int i = 0; i < 4; i++) {
//			obj1.generateDashes();
//		}
		obj1.check();
	}
}
