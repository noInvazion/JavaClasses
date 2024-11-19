package packageone;

public class ClassEight {
	int num1 = 10, num2 = 20, num3;
	public void addTwoNumbers() {
		System.out.println("no parameter");
		num3 = num1 + num2;
		System.out.println(num3);
	}
	public void addTwoNumbers(int num1, int num2) {
		System.out.println("with parameter");
		num3 = num1 + num2;
		System.out.println(num3);
	}
	public void addTwoNumbers(int num1) {
		System.out.println("with one parameter");
		num3 = num1 + num2;
		System.out.println(num3);
	}
	public void addTwoNumbers(float num1, int num2) { //method signature spans from return type to the parameters
		System.out.println("float and int");
		float num3 = num1 + num2;
		System.out.println(num3);
	}
	static void greet(String name) {
		System.out.println("Hello " + name);
	}
	public static void main (String[] args) {
		ClassEight obj1 = new ClassEight();
		obj1.greet("Emmanuel");
		ClassEight.greet("Eniola");
		greet("Golden");
		
//		obj1.addTwoNumbers();
//		obj1.addTwoNumbers(100);
//		obj1.addTwoNumbers(88, 5);
//		obj1.addTwoNumbers(7.0F, 9); //by default, all decimal values are considered as double
//		Hello h1 = new Hello();
//		Hello h2 = new Hello();
//		//Class / static
//		h1.staticVariable = 5;
//		System.out.println(h2.staticVariable);
//		h2.staticVariable = 20;
//		System.out.println(h1.staticVariable +  " + " + h2.staticVariable
//				+ " = " + (h1.staticVariable + h2.staticVariable));
//		
//		//Instance 
//		h1.nonStaticVariable = 5;
//		h2.nonStaticVariable = 20;
//		System.out.println(h1.nonStaticVariable +  " + " + h2.nonStaticVariable
//				+ " = " + (h1.nonStaticVariable + h2.nonStaticVariable));
		
	}
}
	
class Hello {
//	static int num; //Class Variable
	static int staticVariable; 
	int nonStaticVariable; //instance Variable
	
}
