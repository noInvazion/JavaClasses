package packageone;
import java.util.Scanner;

public class Revision {
	int num = 12;
	Chief Udoka;
	Scanner sc;
	
	void setChief(Chief theChief) {
		Udoka = theChief;
	}

	// setter method
	void setNum(int num) {
		if (num < 0)
			this.num = 0;
		this.num = num;
	}

	// getter method
	int getNum() {
		return num;
	}
	
	void acceptNum() {
		
	}

	public static void main(String[] args) {
		Revision r1 = new Revision();
		System.out.println(r1.getNum());
		
		r1.setNum(-5);
		System.out.println(r1.getNum());
		
		r1.setNum(10);
		System.out.println(r1.getNum());
		
		int num = new java.util.Scanner(System.in).nextInt();
	
		r1.setNum(num);
		
	}
}

class Chief {
	int age;
	String name;
	
	Chief(int age, String myName) {
		this.age = age;
		name = myName;
	}
	
}


