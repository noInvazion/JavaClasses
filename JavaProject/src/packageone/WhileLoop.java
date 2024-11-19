package packageone;

public class WhileLoop {
public static void main(String[] args) {
	// for - positive - run
	for (int i = 2; i < 6; i++) {
		System.out.println("hi - " + i);
	}
	
	int counter = 2;
	while (counter < 6) {  // while (true) is for an infinite loop
		// while - positive - run
		System.out.println("hello - " + counter);
		counter++;
	}
	counter = 20;
	do {
		System.out.println("hello - " + counter);
		counter++;
	}
	while (counter < 6);
	System.out.println(counter);
	
	Word();
}
static void Word() {
	String word = "java is very simple";
	String input = "g";
	for (int i = 0; i < word.length(); i++) {
		char letter = word.charAt(i);
		System.out.format("Letter at index %d is %s\n", i, letter);
	}
}
}
