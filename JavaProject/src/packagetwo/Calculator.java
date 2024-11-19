package packagetwo;

interface Jide {
	void add();
}

interface Paul {
	void subtract();
	void divide();
}

interface Tolu {
	void multiply();
}

public class Calculator {
	int x, y;
	
	void add(Jide jide) {
		jide.add();
	}
	
	Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		Calculator2 calc1 = new Calculator2(22, 7);
		
		Arithmetic2 jide1 = new Arithmetic2(1, 3);
		Arithmetic2 jide2 = new Arithmetic2(5, 7);
		
		calc1.add(jide1);
		calc1.add(jide2);
		
		calc1.add(new Arithmetic2(2, 3));
	}
}

class Arithmetic2 implements Jide {
	int x, y;
	
	Arithmetic2(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
		public void add() {
			System.out.println("from second");
			int sum = x - y;
			String res = String.format("%d + %d = %d", x, y, sum);
			System.out.println(res);
		}
	}
	
	class Arithmetic implements Jide {
		int x, y;
		
		Arithmetic(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void add() {
			System.out.println("from first");
			int sum =  x + y;
			String res = String.format("%d + %d = %d", x, y, sum);
			System.out.println(res);
		}
		
		public void divide() {
			int sum = x/y;
			String res = String.format("%d / %d = %d", x, y, sum);
		}
		
		public void subtract() {
			int sum =  x - y;
			String res = String.format("%d - %d = %d", x, y, sum);
			System.out.println(res);
		}
		
		public void multiply() {
			int sum =  x * y;
			String res = String.format("%d * %d = %d", x, y, sum);
			System.out.println(res);
		}
	}