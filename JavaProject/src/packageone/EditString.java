package packageone;

import java.util.Scanner;

public class EditString {
	public static void main(String[] args) {

		System.out.print("Input the word: ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		String[] sentenceArray = { "placeholder" };

		String charval;

//		boolean condition = true;

		while (true) {
			System.out.print("Enter a letter: ");
			charval = sc.next().toUpperCase();
			charval = String.valueOf(charval);

//			sentenceArray[0] = sentence;

			System.out.println(charval);

			switch (charval) {
			case "U":
				sentenceArray[0] = sentence;
				sentence = sentence.toUpperCase();
				System.out.println(sentence);
				break;
			case "L":
				sentenceArray[0] = sentence;
				sentence = sentence.toLowerCase();
				System.out.println(sentence);

				break;
			case "R":
				sentenceArray[0] = sentence;
				String reversed = "";
				for (int i = sentence.length() - 1; i >= 0; i--)
					reversed += sentence.charAt(i);
				sentence = reversed;
				System.out.println(sentence);

				break;
			case "C":
				sentenceArray[0] = sentence;
				char ch1 = sc.next().charAt(0);
				char ch2 = sc.next().charAt(0);

				String newSentence = "";

				for (int i = 0; i < sentence.length(); i++) {
					if (ch1 == sentence.charAt(i)) {
//						 char letterToReplace = sentence.charAt(i);
//						 letterToReplace = ch2;
//						 System.out.println(letterToReplace);
						newSentence += ch2;
					} else {
						newSentence += sentence.charAt(i);
					}
				}
				sentence = newSentence;
				System.out.println(sentence);
				break;
			case "Z":
				System.out.println(sentenceArray[0]);
				break;
			}
			if(charval.equals("X"))
					break;
		}
		System.out.println("You have exited the game");
	}
}
