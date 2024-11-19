package packagetwo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask {

//	metacharacters are the in-built symbols recognised by regex
	// . + * ?
	// ? - 0 or 1 time
	// + - at least 1 time or more times
	// * - 0 or more times
	// . - should be followed with any singular character
	
	
	public static void main(String[] args) {  
//		atleast  3
		String s = "abbbbcccdddeeeefbbddccrreee";
		
		Pattern pt = Pattern.compile("(\\w)\\1+");
		Matcher mt = pt.matcher(s);
		
		while (mt.find()) {
			String sequence = mt.group();
			if (sequence.length() >= 3) {
				int firstIndex = mt.start();
				int lastIndex = mt.end() - 1;
				System.out.println(sequence.charAt(0) + " first index is on index " + firstIndex + " and the last index is on index " + lastIndex);
			}
		}
	}
}
