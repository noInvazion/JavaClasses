package packageone;

public class StringBuilderClass {
	public static void main(String[] args) {
		StringBuilder name =  new StringBuilder();
		name.append(" name");
		System.out.println(name);
		
		String name2 = "";
		name2.concat(" name");
		System.out.println(name2);
		
		String ban = name2.toString(); // toString converts to string...
		
		
	}
}
