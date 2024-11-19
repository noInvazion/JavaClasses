package packageone;

import java.util.Arrays;

public class InheritanceCalculator {

//	int d
	String name = "Tommy";

	public static void main(String[] args) {
		InheritanceCalculator obj = new InheritanceCalculator();
//		String val = obj.toString();
//		System.out.println(obj.toString());
//		System.out.println("end");
//		System.out.println(val);
		
		String val = obj.toString();
		String [] split = val.split(": ");
		System.out.println(split);
		System.out.println(Arrays.toString(split));
		System.out.println(split[1]);

	}

	@Override
	public String toString() {
		System.out.println("hello");
//		return "Senior Chiefs";
		return "Name is: " + name;
	}

	int add(int x, int y) {
		System.out.println("from Calculator");
		return x + y;
	}
}
