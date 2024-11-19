package packageone;

public class InheritanceCont {
}

class Employee {
	int empID;
	String name, dept;

	Employee(String name, String dept, int empID) {
		this.dept = dept;
	}

	public void display() {
	}
}

interface MyInterface {
	public static final int size = 9; // all interface should be declared public static final (by default).
	public abstract void display();  // all methods in an interface are abstract by nature.
	
}

//class D implements MyInterface


class Instructor extends Employee {
	int studentCount;
	String name, dept;

	Instructor(String name, String dept, int empID, int studentCount) {
		super(name, dept, empID); // the child constructor must always make constructor-call to the
		// parent constructor using the super keyword
		this.studentCount = studentCount;
	} // child class needs to make a super-call to the parent

}

/*
 * abstract keyword makes classes or methods abstract
 * You can't make objects of an abstract class, meaning no constructors exists for them
 * Abstract methods have no body but contain parameters e.g:
 * 		void add(), void add(int a) {}
 * When a concrete class inherits an abstract class, all abstract methods in the abstract class must be implemented, that is,
 * given a body e.g
 * 
 *  WHEREAS
 *  If its an abstract class inheriting another abstract class, there is no need to implement because abstract classes
 *  can contain abstract methods by default.
 *  
 *  If there is going to be an abstract method in a class, then the class must be declared abstract and concrete methods...
 *  
 *  When using @Override, the access specifiers in both parent and child must be the same.
 *  
 *  you can't override a final method
 *  you can't extend a final class.
 *  
 *  two ways to initialize final variables;
 *  - declare and assign at once
 *  - declare and assign with constructor using 'this' keyword
 *  
 *  a class can't extend an interface, it can only implement it.
 */
