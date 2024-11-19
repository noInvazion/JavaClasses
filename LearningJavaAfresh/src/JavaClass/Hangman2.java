package JavaClass;

import java.util.Random;
import java.util.Arrays;

public class Hangman2 {
	public static void main(String[] args) {
		String country [] = {"Nigeria","China","Algeria","India","Gambia"};
		
		Random rand = new Random();
		String selectedCountry = country[rand.nextInt(country.length)];
		StringBuffer str = new StringBuffer();
		for (int i=0; i<selectedCountry.length();i++) {
			str.append(" _ ");
		}
		System.out.println("Selected country::>> " + selectedCountry);
		System.out.println("Masked String::>> ");
		
	}

}
