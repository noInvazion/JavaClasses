package packageone;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		String name = "Tommy";
		String hi = String.format("My name is %s\n", name);
		System.out.println(hi);
		
		Loops hg = new Loops();
		int num = 10;
		System.out.println("number is: " + num);
		//for loop
		//for loop
		//for (initialization; condition; counter) begin
		//end
		//for (numeric num1 = 0; num1 < 5; num1 = num1 + 1)
		//begin - end
		
		//num = 1 if it is not specified in the loop
		for (num = 13; num <= 5; num++)
		{
			System.out.println("number is: " + num);
			//num++ - if it is not specified in the for loop
		}
		System.out.println("Outer value: " + num);
		
		// multiplication table - 4
		for (int j = 0; j < 3; j++)
		{
			System.out.print("Enter a number: ");
			int num1 = new Scanner(System.in).nextInt();
			for (int i = 1; i <= 12; i++ ) {
	//			num = 10;
				int res = num1 * i;
	//			System.out.println(num + " * " + i + " = " + res);
				System.out.format("%d * %d = %d\n", num1, i, res);
				
	//			String here = String.form
		}
		}
		
		Loops obj1 = new Loops();
		obj1.Loop2();
		obj1.greetReturn();
	}
		
void Loop2()
{
	// break and continue
	for (int j = 1; j <= 5; j++)
	{
		if (j % 2 == 0)
		System.out.println("value is: " + j);
//		for (int i = 1; i <= j; i++)
//		{
//			System.out.print(j);
//		}
//		System.out.println("");
	}
}
void greetReturn(){
	System.out.println("start - greetReturn");
	for (int i = 3; i <= 7; i++) {
		if (i == 5) {
			return;
		} else if (i % 4 == 0) {
			System.out.println("All 4s");
		} else {
			System.out.println(i);
		}
	}
	System.out.println("end");
}
}
