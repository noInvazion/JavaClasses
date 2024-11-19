package packageone;

enum GenderEnum {
	Male("M"), Female("F");
	
	GenderEnum(String g) {
		System.out.println("Enum cnstructor called...");
	}
	}; // enums are similar to classes
// no need to create an object to access them...
	
	enum Mango {
		Carrie(20), FairChild(25), Haden(15);
		int quantity;
		Mango(int qty) {
			quantity = qty;
		}
		int retrieveQuantity() {
			return quantity;
		}
	}

public class EnumsClass {
	String name;
	String gender;
	
	public static void main(String[] args) {
		GenderEnum g = GenderEnum.Male;
//		System.out.println("Value is: " + GenderEnum.Male);
	}
	
}
