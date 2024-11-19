package packageone;


public class ClassTwo {
	public static void main(String[] args) {
		byte byte_num1 = 127;
		int int_num = byte_num1;
		System.out.println("1. int number is " + int_num);
		System.out.println(Byte.MAX_VALUE); // used to get the maximum value of a data-type
		System.out.println(Byte.MIN_VALUE);
		
		int_num  += 10;
		System.out.println("2. int number is " + int_num );
		byte byte_num = (byte) int_num;
		System.out.println("byte number is " + byte_num);
		
		Student obj = new Student("Cole", "Bennet");
		obj.display();
		obj.show();
	
}
}