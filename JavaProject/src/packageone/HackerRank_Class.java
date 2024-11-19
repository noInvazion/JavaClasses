package packageone;

public class HackerRank_Class {
	public void IntegerCheck(int num) {
		if (num % 2 != 0) {
			System.out.println("Weird");
		}else if (num >= 2 && num <= 5) {
			System.out.println("Not weird");
		
		}else if (num >= 6 && num <= 20) {
			System.out.println("Weird");
		}else if (num > 20) {
			System.out.println("Not weird");
		}
	}
	public void IntegerCheck(float num) {
		if (num % 2 != 0) {
			System.out.println("Weird");
		}else if (num >= 2 && num <= 5) {
			System.out.println("Not weird");
		
		}else if (num >= 6 && num <= 20) {
			System.out.println("Weird");
		}else if (num > 20) {
			System.out.println("Not weird");
		}
	}
	public void IntegerCheck(double num) {
		if (num % 2 != 0) {
			System.out.println("Weird");
		}else if (num >= 2 && num <= 5) {
			System.out.println("Not weird");
		
		}else if (num >= 6 && num <= 20) {
			System.out.println("Weird");
		}else if (num > 20) {
			System.out.println("Not weird");
		}
	}
	
	public void checkEvenNuumbers(int num) {
		if (num % 2 != 0) {
			System.out.println("weird");
		}
		else {
			if (num >= 2 && num <= 5) {
				System.out.println("not weird");
			}else {
				if(num >= 5 && num <= 20) {
					System.out.println("weird");
				}else {
					if(num > 20) {
						System.out.println("not weird");
					}
				}
			}
		}
	}
	
public static void main(String[] args) {
	HackerRank_Class obj1 = new HackerRank_Class();
	obj1.IntegerCheck(30);
	obj1.IntegerCheck(15);
	obj1.IntegerCheck(17);
	obj1.IntegerCheck(90);
	obj1.IntegerCheck(16);
}
}
