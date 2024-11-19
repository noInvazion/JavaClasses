package JavaClass;
import java.util.Scanner;
import java.util.Random;

public class FullGame{
	
	Scanner sc = new Scanner(System.in);

	FullGame(){
		System.out.println("\t\t\t\t\t\t\t\t Menu\t\t\n1.Play Hangman\n2.View Game Instructions\n3.Exit Hangman");
		
	}
	String country = "";
	String countries [] = {"Nigeria", "Ghana", "Egypt", "Madagascar", "Kenya", "Zimbabwe"};
	
	String playGame() {
		
		while(true) {
			country = generateCountry();
			
			System.out.print("Guess the letter >>");
			char letter = sc.next().charAt(0);
			
			for (int index = 0; index < country.length(); index++) {
				if (letter == country.toLowerCase().charAt(index)) {
					System.out.printf("The letter %c is found at index %d.\n", letter, index);
					return "The word is " + country + ".";
				}
			} System.out.println("You guessed incorrectly!");
			continue;
//			return "You lost! The word was Nigeria, dumdum!";
		}
		
		
	}
	
	String generateCountry() {
		Random rand = new Random();
		int luckyNumber = rand.nextInt(0, countries.length);
		country = countries[luckyNumber];
		return country;
		
	}
	
	String viewInstructions() {
		return ("Viewing Instructions!");
	}
	
	String exitGame() {
		return ("Hangman Game exited!");
	}
	
	String menu() {
		while (true) {
			System.out.print("Enter a valid option: "); //
			int option = sc.nextInt();
			switch (option) {
			case 1:
				return playGame(); // this and object name
			case 2:
				return this.viewInstructions();
			case 3:
				return this.exitGame();
			default:
				System.out.println("Invalid option.");
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		FullGame gameOfficial = new FullGame();
		
		System.out.println(gameOfficial.menu());
	}
}
