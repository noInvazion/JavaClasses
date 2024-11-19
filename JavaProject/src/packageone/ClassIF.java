package packageone;
import java.util.*;


public class ClassIF {
	public void evenNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of days: ");
		int day = sc.nextInt();
		if (day <= 12) {
			switch(day){
			case 1:
				System.out.println("a patridge in a pear tree!");
				System.out.println("two turtle doves!");
				break;
			case 3:
				System.out.println("three french hens !");
				break;
			case 4:
				System.out.println("four collin bears!");
				break;
			case 5:
				System.out.println("five golden rings!");
				break;
			case 6:
				System.out.println("six geese are laying!");
				break;
			case 7:
				System.out.println("seven pipers piping!");
				break;
			case 8:
				System.out.println("eight ladies dancing!");
				break;
			case 9:
				System.out.println("nine boxers boxing!");
				break;
			case 10:
				System.out.println("ten drummers drummming!");
				break;
			case 11:
				System.out.println("eleven swimmers swimming!");
				break;
			case 12:
				System.out.println("twelve skater skating!");
				break;
		}
		}else {
			System.out.println("Sorry. Invalid input!");
			
		}
		
		
	}
	
	

	
	public static void main(String[] args) {
//		ClassIF obj1 = new ClassIF();
//		obj1.evenNumbers();
		
		ifStatement obj1 = new ifStatement();
//		obj1.checkScore(70);
//		obj1.checkScore(65);
//		obj1.checkScore(0);
//		obj1.checkScore(90);
//		obj1.checkScore(41);
//		obj1.checkScore(200);
		obj1.checkGrade();
	}
}

class ifStatement{
	public void checkScore(int score) {
		String grade = "";
		if (score > 100) {
			grade = "A";
		}else if (score >= 70 && score <= 100) {
			grade = "B";
		}else if (score < 70 && score >= 60){
			grade = "C";
		}else if (score < 60 && score >= 55) {
			grade = "D";
		}else if (score < 55 && score >= 45) {
			grade = "E";
		}else if(score < 45 && score >= 40) {
			grade = "F";
		}else{
			grade = "carry over";
		}
			System.out.println("Your grade is " + grade);
	}
	
	public void checkGrade2() {
		String grade = "Excellent"; //.toLowerCase()
		if (grade.equalsIgnoreCase("outstanding")) {
			System.out.println("A1");
		} else if (grade == "excellent") {
			System.out.println("B2");
		} else {
			System.out.println("Not found!");
		}
	}
	
	public void checkGrade() {
		String grade = "outstanding";
		switch (grade) {
		case "outstanding":
		case "ogbon":
			System.out.println(grade + " : A");
			break;
		case "excellent":
			System.out.println(grade + " : B");
			break;
		case "good":
			System.out.println(grade + " : C");
			break;
		default:
			System.out.println(grade + " : no idea");
			
		}
	}
}