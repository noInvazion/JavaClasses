package JavaClass;

import java.util.Random;
import java.util.Scanner;

//Implementations: Trial Count and Congratulation Message
// Fix this code!

public class Hangman {

	Scanner sc = new Scanner(System.in);
	String country = getCountry();
	StringBuffer dash = getDashes();
	char[] missedLetters = new char[10];

	Hangman() {
		System.out.println("\t\t\t\t\t\t\t\t Menu\t\t\n1.Play Hangman\n2.View Game Instructions\n3.Exit Hangman");
		String result = menu();
		if (result.equals(viewInstructions())) {
			System.out.println("Viewing Instructions!");
		} else if (result.equals(exitGame())) {
			System.out.println("Hangman Game exited!");
		}

	}

	String playGame() {
		System.out.println("Welcome to Guess The Country! Enter a letter to begin.");
		String userGuess = "";

		while (true) {
			System.out.println("Guess the letter >>");
			char letter = sc.next().charAt(0);

			for (int index = 0; index < country.length(); index++) {
				if (letter == country.toLowerCase().charAt(index)) {
					dash.deleteCharAt(index * 2);
					dash.insert(index * 2, letter);
				} else if (letter != country.toLowerCase().charAt(index)) {
					missedLetters[index] = letter;
				}
			}
			System.out.println(dash);
			
			if  (String.valueOf(dash).contains("_") == false) {
				String message = "Congratulations! You've won.";
				System.out.println(message);
				break;			
			}
		}
		
		return "default";

	}

	String getCountry() {
		String[] countries = { "Nigeria", "Kenya", "Nairobi", "Egypt", "Senegal" };
		Random rand = new Random();
		int randomNumber = rand.nextInt(0, countries.length);
		return countries[randomNumber];

	}

	StringBuffer getDashes() {

		StringBuffer dash = new StringBuffer();
		for (int i = 0; i < country.length(); i++) {
			dash.append("_ ");
		}

		return dash;
	}

	String viewInstructions() {
		return "Viewing Instructions!";
	}

	String exitGame() {
		return "Hangman Game exited!";
	}

	String menu() {
			System.out.print("Enter a valid option: "); //
			int option = sc.nextInt();
			switch (option) {
			case 1:
				return playGame(); // this and object name
			case 2:
				return viewInstructions();
			case 3:
				return exitGame();
			default:
				return "Invalid option.";
		}
	}

	public static void main(String[] args) {
		Hangman gameOfficial = new Hangman();
	}
}
