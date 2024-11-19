package packageone;
import packageone.ClassEight;

public class Student {
	ClassEight one;
	String firstName = "Golden", lastName = "Adeola", course = "ENG";
	int age = 12;
	
	public Student(String lastName, String fName, String course, int sAge) {
		this.lastName = lastName;
		firstName = fName;
		age = sAge;
		this.course = course;
//		one = new ClassEight() ;
		
		}
	
	public Student(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println("Name is: " + firstName + " " + lastName + " " + course + " " + age);
	}
	
	void addition(int x, int y) {
		one.addTwoNumbers(x,y);
	}
	void show() {
		this.display();
		display();
		
	}

		
	public static void main(String[] args) {
		ClassEight one = new ClassEight();
		
		Student s1 = new Student("Sola", "JIde", "Java", 12);
		s1.display();
		s1.firstName = "New Value";
		s1.display();
		s1.one.addTwoNumbers();
		one = new ClassEight();
	
//		String fname = "A", lName = "B", course = "ENG"; 
//		int sAge = 12;
//		Student s2 = new Student(fname, lName, course, sAge);
//		s2.display();	
		
//		int num; //package-private
//		public num1;
//		private num2;
		
	}
	}

