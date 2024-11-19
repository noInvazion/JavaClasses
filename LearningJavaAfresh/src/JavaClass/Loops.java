package JavaClass;
import java.util.Scanner;

public class Loops {
	
	void forLoop() {
		for (int count = 0; count <= 2; count++) {
			System.out.printf("!Counter is at %d!\n", count);
		}
	}
	
	void whileLoop() {
		
	}
	
	void doWhileLoop() {
		
	}
	
	public static void main(String[] args) {
		Loops loop = new Loops();
	//	loop.doWhileLoop();
	//	loop.whileLoop();
//		loop.forLoop();
		
		GradingSystem cgpa = new GradingSystem();
//		cgpa.gradeSystem();
		cgpa.days();
//		cgpa.multiplicationTable();
//		cgpa.multiplicationTable2();
	}
}

class GradingSystem {
	
	void gradeSystem() {

		while (true) {
			
			Scanner accept = new Scanner(System.in);
			
			System.out.print("Enter your total score:");
			int score;
			
			char grade;
			
			score = accept.nextInt();
			
			if (score > 100 || score < 0) {
				continue; }	
			else if (score >= 90) {
				grade = 'A';
				System.out.println("Your grade is " + grade);
				break;}
			else if (score >= 80) {
				grade = 'B';
				System.out.println("Your grade is " + grade);
				break;}
			else if (score >= 50) {
				grade = 'C';
				System.out.println("Your grade is " + grade);
				break;}
			else if (score >= 40) {
				grade = 'D';
				System.out.println("Your grade is " + grade);
				break;}
			else if (score < 40){
				grade = 'F';
				System.out.println("Your grade is " + grade);
				break;
			}
			System.out.println();
		}
		
	}
	
	void days() {
		int months = 8;
		
		switch(months) {
		
		case 0 -> System.out.println("This month does not exist.");
		
		case 1 -> System.out.println("Welcome to January");
			
		case 2 -> System.out.println("Welcome to February");
			
		case 3 -> System.out.println("Welcome to March");
			
		case 4 -> System.out.println("Welcome to April");
			
		case 5 -> System.out.println("Welcome to May");
			
		case 6 -> System.out.println("Welcome to June");
			
		case 7 -> System.out.println("Welcome to July");
			
		case 8 -> System.out.println("Welcome to August");
			
		case 9 -> System.out.println("Welcome to September");
	
		case 10 ->System.out.println("Welcome to October");
			
		case 11 ->System.out.println("Welcome to November");
			
		case 12 ->System.out.println("Welcome to December");
		
		default -> System.out.println("What the hell are you thinkin', dude!");
			
		}
			
	}
	
	void multiplicationTable() {
		for(int num1 = 1; num1<=10; num1++){
			for(int num2 = 1; num2<=10; num2++) {
				int result = num1 * num2;
				System.out.printf("%d x %d = %d\n", num1, num2, result);
			}
			System.out.println();
		}
	}
		
	void multiplicationTable2() {
		for(int num1 = 1; num1<=10; num1++){
			for(int num2 = 1; num2<=10; num2++) {
				int result = num1 * num2;
				System.out.printf("%d x %d = %d\t", num2, num1, result);
			}
			System.out.println();
		}
	}
}


