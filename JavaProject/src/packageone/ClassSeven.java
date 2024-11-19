package packageone;

public class ClassSeven {
	int num1, num2, num3;
	
	void multiplyTwoNumbers() {
		num3 =  num1 * num2;
		System.out.println("Multiplication of the two numbers results in: " + num3);
	}
	void divideTwoNumbers() {
		num3 =  num1 / num2;
		System.out.println("Division of the two numbers results in: " + num3);
	}
	void subtractTwoNumbers() {
		num3 =  num1 - num2;
		System.out.println("Subtraction of the two numbers results in: " + num3);
	}
	void addTwoNumbers() {
		num3 =  num1 + num2;
		System.out.println("Addition of the two numbers results in: " + num3);
	}
	
	void modTwoNumbers() {
		num3 =  num1 % num2;
		System.out.println("Remainder of the two numbers results in: " + num3);
	}
	public static void main(String[] args) {
		ClassSeven multiply = new ClassSeven();
		multiply.num1 = 10;
		multiply.num2 = 5;
		multiply.multiplyTwoNumbers();
		
		ClassSeven division = new ClassSeven();
		division.num1 = 50;
		division.num2 = 10;
		division.divideTwoNumbers();
		
		ClassSeven subtract = new ClassSeven();
		subtract.num1 = 500;
		subtract.num2 = 100;
		subtract.subtractTwoNumbers();
		
		ClassSeven add = new ClassSeven();
		add.num1 = 10;
		add.num2 = 30;
		add.addTwoNumbers();
		
		ClassSeven mod = new ClassSeven();
		mod.num1 = 10;
		mod.num2 = 3;
		mod.modTwoNumbers();
		
	}

}
