package JavaClass;

public abstract class GameTemplate {

	abstract String playGame();
	
	abstract String viewInstructions();
	
	void exitGame() {
		System.out.printf("You have succesfully exited the game!\n Have a good life!");
	}
}


interface Template{
	
	// variables in interfaces are final and static
	// methods are public in an interface
	// when implementing the methods, you have to specify the final static for variables and public for methods
	// interfaces are templates so they only have abstract methods
	// when you are extending an interface from a class, use the implements keyword
	// when you are extending an interface from another interface, use the extends keyword
	String playGame();
}
