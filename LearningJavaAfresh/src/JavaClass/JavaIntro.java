package JavaClass;
import java.util.Scanner;

public class JavaIntro {
	int num1, num2;
	
	JavaIntro(){
		System.out.println("This is a constructor!");
		num1 = 1;
		num2 = 1;
		
	}
	
	int addition() {
		int sum = num1 + num2;
		
		return sum;
	}

	public static void main(String[] args) {
				
		String name;
		int age;
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter your name here: ");
//		name = sc.nextLine();
//		System.out.print("How old are you: ");
//		age = sc.nextInt();
//		
//		System.out.println("Hello " + name + ". You are " + age + " years old.");
		
		JavaIntro java = new JavaIntro();
		System.out.println(java.addition());
		
		
	}

}
