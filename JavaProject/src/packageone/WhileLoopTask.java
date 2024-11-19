package packageone;
import java.util.Scanner;

public class WhileLoopTask {
	public static void main(String[] args) {
		String word = "Java is very simple".toLowerCase();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a character: ");
		char input = sc.next().toLowerCase().charAt(0);
//		char input = "b".charAt(0);

		boolean found = false;

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (letter == input) {
				found = true;
				System.out.format("Letter %c was found at index %d\n", letter, i);
				break;
			}
		}

		if (found != true)
			System.out.println("Letter not found!");
	}
}