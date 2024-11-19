package packageone;

public class Loops3 {
	public static void main(String[] args) {
		Loops3 obj = new Loops3();
		obj.GetBreak();
		obj.GetContinue();
		obj.GetReturn();
	}
	void GetContinue() {
	System.out.println("start - greetContinue");
		for (int i = 3; i <= 7; i++) {
			if (i == 5) {
				continue;
			} else if (i % 4 == 0) {
				System.out.println("All 4s");
			} else {
				System.out.println(i);
			}
			System.out.println("here at " + i);
		}
		System.out.println("end");
	}
	
	void GetBreak() {
		System.out.println("start - greetBreak");
			for (int i = 3; i <= 7; i++) {
				if (i == 5) {
					break;
				} else if (i % 4 == 0) {
					System.out.println("All 4s");
				} else {
					System.out.println(i);
				}
				System.out.println("here at " + i);
			}
			System.out.println("end");
		}
	
	void GetReturn() {
		System.out.println("start - greetReturn");
			for (int i = 3; i <= 7; i++) {
				if (i == 5) {
					return;
				} else if (i % 4 == 0) {
					System.out.println("All 4s");
				} else {
					System.out.println(i);
				}
				System.out.println("here at " + i);
			}
			System.out.println("end");
		}
}