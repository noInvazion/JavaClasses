package packageone;

class ClassFour{
    int num1 = 6;
    int num2 = 5;
    void add() {
        int sum;
        System.out.println("Class Three");
        sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}
public class ClassThree {
	public static void main(String[] args) {
		int num3 = 10;
		int num4 = 15;
		System.out.println("It works...");
		ClassFour obj1 = new ClassFour(); 
		obj1.add();
		System.out.println(Integer.SIZE);
	}
	    public void dataTypes2() {
		    System.out.println(Integer.SIZE);
}
}