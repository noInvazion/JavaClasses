package packageone;
import java.util.Scanner;


import java.util.Random;
public class HangmanGame {
	void menu() {
		System.out.println("1. Play \n 2. View game instructions \n 3. Quit");
	}
	void check() {
		Scanner sc = new Scanner(System.in); // Scanner sc = new Scanner(System.in);
		System.out.println("What option are you choosing: "); //line you're using
		byte option = sc.nextByte(); //sc.next(); 
		if (option == 1) {  //System.out.println("text");
			System.out.println("Game has started. Choose your avatar!");
		}else if (option == 2) {
			System.out.println("GAME MOVEMENT:\n Use WASD keys for regular movements. The R-key to make a dash.\n Use right-mouse for aim and left-mouse for shooting. Use F-key to pick a weapon/tactical/lethal equipment!\n Read more on hangman.com");
		}else if (option == 3) {
			System.out.println("You have requested to exit the app! Goodbye.");
		}else {
			System.out.println("You have chosen an invalid option!");
			
		}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What's your player name: ");
		String user = sc.nextLine();
		System.out.println("Welcome " + user );
		HangmanGame game = new HangmanGame();
//		game.menu();///////////////////////////////////////////////////////////////////////////////////.
		
		System.out.println (true || true);
		System.out.println (true || false);
		System.out.println (false || true);
		System.out.println (false || false);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && true);
	
		int num = 5;
		System.out.println(++num);
		System.out.println(num++);
		System.out.println(num);
		
		num = 5;
		System.out.println(num++);
		System.out.println(++num);
		System.out.println(num);
		
		System.out.println(!true); //false
		System.out.println(!false); //true
		System.out.println(!(3 > 5)); //false
		
		System.out.println("This is it!");
		int num1 = 5;
		System.out.println(12 | 24);
		System.out.println(12 & 24);
		
		System.out.println(3 << 0);
		System.out.println(3 << 1);
		System.out.println(3 << 2);
		System.out.println(3 << 3);
		
//		
//		Random rnd = new Random();
//		System.out.println(rnd.nextInt(2,5));
//		System.out.println(rnd.nextInt(2,5));
//		System.out.println(rnd.nextInt(2,5));
//		
//		System.out.println("END");
//		
//		System.out.println("Start");
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter name: ");
//		String name = sc.nextLine();
//		System.out.println("My name is " + name);
//		
//		System.out.print("Enter age: ");
////		int age = Integer.parseInt(sc.nextLine()); //instead of converting, you can use sc.nextString or whatever...
//		int age = sc.nextInt();
//		System.out.println("Age is " + age);
//		sc.nextLine();
//		
//		System.out.print("Enter course: ");
//		String course = sc.nextLine().toLowerCase();
//		System.out.println("Course is " + course);
//		
//		System.out.println("END"); 
		
		class Class_sth {
			Integer methodEven(int num) {
			int mod = num % 2;
			System.out.println("Function is called on " + num);
			return mod;

		}
			Integer methodEven(float num) {
			float mod = num % 2;
			System.out.println("Function is called on " + num);
			return (int) mod;

		}
			Integer methodEven(double num) {
			double mod = num % 2;
			System.out.println("Function is called on " + num);
			return (int) mod;

		}
		 
	}
	}
}


