package JavaClass;

public class InheritanceClass implements Template {

	@Override
	public String playGame() {
		return "Loading Call Of Duty: BlackOps!";
	}
	public static void main(String[] args) {
		
		System.out.println(new InheritanceClass().playGame());
		

	}

}
