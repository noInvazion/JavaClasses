package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentException {
	Scanner sc = new Scanner(System.in);

	void studentData() {
		System.out.print("Enter your name>>"); // Input mismatch
		String studentName = sc.next();

		try {
			System.out.print("Enter your age>>"); // age limit, input,
			int age = sc.nextInt();
			if (age < 20) {
				throw new AgeLimitException("You are not old enough");
			}
		} catch (AgeLimitException e) {
			System.out.println(e.getMessage()); // why cant i use super
		} catch (InputMismatchException e) {
			System.out.println("Data Type Conflicts");
		}

		try {
			boolean check = false;
			System.out.print("Enter your course>>");
			String courseList[] = { "Computer Science", "Mathematics", "Physics"};
			sc.nextLine();
			String userCourse = sc.nextLine();
			
			for(int i = 0; i < courseList.length; i++) {
				if (userCourse.equalsIgnoreCase(courseList[i])) {
					check = true;
					break;
				} else {
					check = false;
				}
			}
			if (check == false) {
				throw new CourseNotFound("This course was not found in our database!");
			}
			
		} catch (CourseNotFound e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.print("Gender (Male/Female)>>");
			String gender = sc.next();
			if (gender.equalsIgnoreCase("male") && gender.equalsIgnoreCase("female")) {
				
			} else {
				throw new GenderNotFound();
			}
		} catch(GenderNotFound e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		StudentException stud = new StudentException();
		stud.studentData();

	}
}

class AgeLimitException extends Throwable {
	public AgeLimitException() {
		super("You are not old enough!");
	}

	public AgeLimitException(String message) {
		super(message);
	}
}

class CourseNotFound extends Throwable {
	public CourseNotFound() {
		super("Course Not Found!");
	}

	public CourseNotFound(String message) {
		super(message);
	}
}

class GenderNotFound extends Throwable{
	public GenderNotFound() {
		super("We are not homophobic but the teacher is, sorry.");
	}
	
	public GenderNotFound(String message) {
		super(message);
	}
}
