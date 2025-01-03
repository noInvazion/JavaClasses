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

		while (true) {
		try {
			 menu();
			 break;
		} catch (InvalidOptionException e) {
			System.out.println(e.getMessage());
			continue;
		} finally {}
		}
	}

	void playGame() {
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

	void menu() throws InvalidOptionException{
			System.out.print("Enter a valid option: "); //
			int option = sc.nextInt();
			switch (option) {
			case 1:
				playGame(); // this and object name
				break;
			case 2:
				System.out.println(viewInstructions());
				break;
			case 3:
				System.out.println(exitGame());
			default:
				throw new InvalidOptionException();
		}
	}

	public static void main(String[] args) {
		Hangman gameOfficial = new Hangman();
	}
}


class InvalidOptionException extends Throwable {
	public InvalidOptionException() {
		super("Invalid Option passed.");
	}
	
	public InvalidOptionException(String message) {
		super(message);
	}
}