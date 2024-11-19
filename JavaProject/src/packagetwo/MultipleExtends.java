package packagetwo;

interface MulitpleExtendsInterface {
	
}

public class MultipleExtends extends abstractClass implements MulitpleExtendsInterface  {
	void add() {
		System.out.println("Method that adds");
	}
	
	void subtract() {
		System.out.println("Method that subtracts");
	}
	
	public static void main(String[] args) {
		MultipleExtends ext = new MultipleExtends();
		ext.add();
		ext.subtract();
	}
}


abstract class abstractClass{
	abstract void add();
	abstract void subtract();
}