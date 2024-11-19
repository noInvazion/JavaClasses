package packageone;


class Arithmetic {
	
	int x, y;
	Arithmetic(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Parent constructor with argument");
	}
	
	void add() {
		System.out.println("Add from parent");
		String fmt = String.format("%d + %d = %d", x, y, x+y);
		System.out.println(fmt);
	}
	
	void subtract() {
		System.out.println("Subtract from parent");
	}
	
	public Arithmetic() {
		System.out.println("Parent constructor with no argument");
	}
}

public class Calculator extends Arithmetic {
	Calculator(int a, int b) {
		super(a, b); //send 2 arguments
		System.out.println("Child constructor");
	}
	
	@Override 
	void add() {
		super.add();
		System.out.println("x is: " + x);
		System.out.println("Add from child");
	}
	
	public static void main(String[] args) {
//		Calculator calc1 = new Calculator(7,8)

	}
	
	/* 
	 * super = new Calculator(); [constructor from parents]
	 * super passes values to the parent class while constructor of parent just makes reference.
	 * when inheriting, the child constructor must match at least one constructor from parents.
	 * Accurately and precisely, the child constructor must make a constructor call to parent constructor.
	 * Polymorphism is creating objects, creating multiple objects, calling objects, calling constructor
	 * Two types of Polymorphism: dynamic and static
	 * Overloading a method, constructor etc is Static Polymorphism
	 * Overriding a method, constructor etc is dynamic Polymorphism
	 */
}


abstract class Simple {
	void subtract() {}
	abstract void add(); 
	/* an abstract method should not have a body curly-brace {}
	 * an abstract class can contain abstract methods, thought it is not compulsory 
	 you cannot create an object in an abstract class
	 If you have an abstract method in an abstract class, to access the abstract method in the class, you can extend or implement all methods
	 An abstract class acts as a super class
	 */
	
}