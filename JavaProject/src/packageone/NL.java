package packageone;

import java.util.Arrays;

public class NL {
	int[] oddArray = { 7, 7, 7, 8, 8 };

	int[] oddNUmbers = { 1, 3, 5, 7, 9 };

	void checkArray() {
		int count = 0;
		for (int i = 0; i < oddArray.length; i++) {
			System.out.println(oddArray[i]);

			int first = oddArray[1];
			if (oddArray[i] == first) {
				count++;
			}
		}
		System.out.println("Count of 7 is " + count);
	}

	public static void main(String[] args) {
		NL obj = new NL();
		obj.checkArray();
	}
}
