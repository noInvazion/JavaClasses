package packageone;

public class ClassSix {
	static String name = "First_name";  //makes the variable static so change applies once when using an object
	int num1 = 15, num2 = 30, num3;
	
	void addTwoNumbers() {
		num3 = num1 + num2;
		System.out.println(num3);
	}

	void greet() {
		System.out.println("Good morning!");
}
	void display(){
		System.out.println("First number is " + num1);
		System.out.println("Second number is " + num2);
		System.out.println("Name is " + name + "\n");
	}
	public static void main(String[] args) {
//		int num1 = 20, num2 =  7, num3;
//		num3 = num1 + num2;
//		System.out.println(num3);
		
//		ClassName objName = new ClassName();
//		ClassSix add = new ClassSix();
//		add.addTwoNumbers();
//		
//		add.num1 = 50;
//		add.addTwoNumbers();
//		
//		add.num2 = 500;
//		add.addTwoNumbers();
//		
//		add.num2 = 60;
//		add.num1 = 40;
//		add.addTwoNumbers();
		ClassSix obj1 = new ClassSix();
		ClassSix obj2 = new ClassSix();
		obj1.name = "Eniola";
		obj1.num1 = 5;
		obj1.num2 = 10;
		
		obj1.display();
		obj2.display();
		
		ClassSix obj3 = new ClassSix();
		
		
		
		//WRITE A CODE THAT INVOLVES OTHER ARITHMETIC OPERATION, PRINT OUT METHOD 
	}
}
