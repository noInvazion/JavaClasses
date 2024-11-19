package packageone;

//import java.util.Scanner;
		public class ClassEven {
			public static String isEven(int num) {
				System.out.println("Function is even called on " + num);
				return num + " is even? " + (num % 2 == 0);
			}
			public boolean isEven2(int num) {
				System.out.println("Number is " + num);
				return num % 2 == 0;
			}

	public static void main(String[] args) {
//		ClassEven meth = new ClassEven();
//		meth.methodEven(5);
//		meth.methodEven(4.0F);
//		meth.methodEven(16.0);
		ClassEven c1 = new ClassEven(); 
		
		boolean res1, res2, res3; //declaring the variable with boolean data-types
		res1 = c1.isEven2(11);
		res2 = c1.isEven2(12);
		res3 = new ClassEven().isEven2(13);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		// use if-else statements to check if a number is even or odd...
		
		System.out.println(c1.isEven2(22)); //displays both the return and print functions.
		
		String res = 15 % 2 == 0 ? "even" : "odd";
		System.out.println();
		
		System.out.println(5 > 3 ? 5 : 3); // ternary operation returns true or false, true comes first...
	}
}
