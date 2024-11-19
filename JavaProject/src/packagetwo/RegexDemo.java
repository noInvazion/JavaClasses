package packagetwo;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
	
	public static void main(String[] args) {
		
		/*
		 * . - matches a single character
		 * \w - matches any word character i.e aA-zZ, 0-9 and _ 
		 * \W - matches non word characters 
		 * \s - whitespace character e.g \t, \n, \r, \f
		 * \S - non-whitespace character
		 * \d - any digit, 0-9
		 * \D - nondigits 
		 */
		String regex = "[\\d]{3}";
		String text = "666";
		
		Pattern pt = Pattern.compile(regex);
		Matcher mt = pt.matcher(text);
		
		boolean result = mt.matches();
		System.out.println(result);
	}

	
}
