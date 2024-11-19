package JavaClass;

import java.util.Scanner;

public class GetAndSet {

	int age, score;
	String name;
	
	void setAge(int age) {
		this.age = age;
	}
	
	void setScore(int score) {
		this.score = score;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return age;
	}
	
	int getScore() {
		return score;
	}
	
	String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		GetValues obj = new GetValues();
	}
	

}

class GetValues extends GetAndSet{
	
	GetValues(){
		Scanner sc = new Scanner(System.in);
//		System.out.println("Set one of them: ");
		setAge(sc.nextInt());
		System.out.println(getAge());
		
	}
	
}
