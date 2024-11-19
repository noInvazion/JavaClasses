package Hangman;
import java.util.Scanner;


import java.util.Random;
public class hangmanGame {
	void menu() {
		System.out.println("1. Play \n2. View game instructions \n3. Quit");
	}
	void check() {
		Scanner sc = new Scanner(System.in); // Scanner sc = new Scanner(System.in);
		System.out.print("What option are you choosing: "); //line you're using
		byte option = sc.nextByte(); //sc.next(); 
		if (option == 1) {  //System.out.println("text");
			playGame();
		}else if (option == 2) {
			instructGame();
		}else if (option == 3) {
			exitGame();
		}else {
			System.out.println("You have chosen an invalid option!");
			
		}
	}
	void playGame() {
		System.out.println("Method playGame was invoked!");
	}
	
	void instructGame() {
		System.out.println("Method instructGame was invoked!");
	}
	
	void exitGame() {
		System.out.println("Method exitGame was invoked!");
	}
public static void main(String[] args) {
	hangmanGame obj1 = new hangmanGame();
	obj1.menu();
	obj1.check();
}	 
}