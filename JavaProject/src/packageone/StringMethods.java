package packageone;
import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {

		
		String name = new String ("Tomisin");
		String dept = new String();
		dept = "MMS";
		System.out.println(dept);
		
		String course = "java";
		System.out.println(course);
		
		Integer n1 = 5;
		Integer n2 = new Integer("5");
		Integer n3 = Integer.valueOf("5");
		Integer n4 = Integer.valueOf(5);
		
		
		
		String fullName = "Tommy";
		System.out.println("Length is: " + fullName.length());
		
		
		
		System.out.println("Convert to upper case is: " + fullName.toUpperCase());
		System.out.println("Convert to lower case is: " + fullName.toLowerCase());
		
		System.out.println("Fifth character is: " + fullName.charAt(4));
		
		System.out.println("Starts with Tom: " + fullName.startsWith("Tom"));
		System.out.println("Starts with Tim: " + fullName.startsWith("Tim"));
		
		System.out.println("Ends with mmy: " + fullName.endsWith("mmy"));
		System.out.println("Ends with mmi: " + fullName.endsWith("mmi"));
		
		System.out.println("Tommy = Tommy: " + fullName.equals("Tommy"));
		
		String text = "Java is too easy";
		int start = text.indexOf("i");
		System.out.println(text.substring(start));
		int end = text.lastIndexOf("s");
		System.out.println(text.substring(start, end + 1));
		
		System.out.println(text.length());
		System.out.println("text is: " + text + ".");
		text = text.trim();
		System.out.println(text.length());
		System.out.println("text is: " + text + ".");
		
		String sentence = "Honourable Class Rep";
		char [] arr = new char[15];
		arr[2] = 'A';
		arr[7] = '7';
		arr[10] = 'x';
		System.out.println(Arrays.toString(arr));
		
		int dstStartIndex = 3;
		int srcStartIndex = sentence.indexOf("C");
		int srcEndIndex = sentence.lastIndexOf("s");
		
		sentence.getChars(srcStartIndex, srcEndIndex, arr, srcEndIndex);
		System.out.println("2. " + Arrays.toString(arr));
		
		srcEndIndex += 1;
		
		sentence.getChars(srcStartIndex, srcEndIndex, arr, srcEndIndex);
		System.out.println("3. " + Arrays.toString(arr));
		
		dstStartIndex = 11;
		sentence.getChars(srcStartIndex, srcEndIndex, arr, srcEndIndex);
		System.out.println("4. " + Arrays.toString(arr)); //displays out of bounds
		
		sentence = "C a T";
		String words [] = {};
		
		words = sentence.split(" ");
		System.out.println(Arrays.toString(words));
		text = "java is a lot simple";
		
		text = text.replace(words[1], words[2]);
		System.out.println(text);
		
		
		
		//compareTo method is used to compare two strings
		//and also used for sorting
		String name1 = "hello", name2 = "h1";
		System.out.println(name1.compareTo(name2)); 
		System.out.println(name2.compareTo(name1));
		
		String hello = "hello";
		hello.toUpperCase();
		System.out.println(hello);
		
		//StringBuilder and StringBuffer
		
//		StringBuilderClass str1 = new StringBuilderClass();
//		System.out.println(str1);
////		System.out.println("Length: " + str1.length());
////		System.out.println("Capacity: " + str1.capacity());
////		
////		str1.append("This is my string value");
////		System.out.println("2. Length: " + str1.length());
////		System.out.println("2. Capacity: " + str1.capacity());
////		
////		str1.append(" , java is not difficult.");
////		System.out.println(str1);
////		System.out.println("2. Length: " + str1.length());
////		System.out.println("2. Capacity: " + str1.capacity());
////		
//		str1.reverse();
//		System.out.println("2. Length: " + str1.length());
//		System.out.println("2. Capacity: " + str1.capacity());
//		
//		StringBuilderClass str = new StringBuilderClass("0123456789");
//		System.out.println(str.delete(3, 7));
//		System.out.println(str);
//		
//		String Tom = "Tommy";
//		StringBuilderClass strOne = new StringBuilderClass();
//		System.out.println(strOne);
////		strOne.append(false);
//		
//		System.out.println(str.insert(3,  "abc"));
//		
//		str = new StringBuilderClass("Java is simple");
		
		
		}
		
	}
