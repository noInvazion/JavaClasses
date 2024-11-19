package packagetwo;

public class ExtendsException extends Exception {
	ExtendsException() {
		super("Divisible by 2");
	}

	ExtendsException(String message) {
		super(message);
	}

	void checkException() {
		for (int i = 1; i <= 10; i++) {
			try {
				if (i % 2 == 0) {
					throw new ExtendsException();
				} else if (i % 3 == 0) {
					throw new ExtendsException("Error occured");
				}
				System.out.println("Value of i is: " + i);
			} catch (ExtendsException ee) {
				System.out.println("Error occured: " + ee.getMessage());
			}
		}
	}

	public static void main(String[] args) throws Exception {
		ExtendsException obj = new ExtendsException();
		obj.checkException();
	}
}
