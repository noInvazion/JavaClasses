package packageone;

import java.util.Arrays;

public class Shoe {
	public final String shoeBrand;
	public final double shoeSize;

	Shoe(String shoeBrand, double shoeSize) {
		this.shoeBrand = shoeBrand;
		this.shoeSize = shoeSize; // instance variables public and final
	}

	public static void main(String[] args) {
		Walking w1 = new Walking("Hanwag", 43.5, true);
		Walking w2 = new Walking("Merrell", 42, false);
		Running r1 = new Running("Nike", 43, 250);

		Shoe[] shoeArray = { w1, w2, r1 };
//		System.out.println(Arrays.deepToString(shoeArray));

		for (int i = 0; i < shoeArray.length; i++) {
			Shoe[] productArray = shoeArray[i];
			System.out.println();
//			System.out.println(Arrays.deepToString(productArray));
			for (int j = 0; j < productArray.length; j++) {
				if (j == 0) {
					System.out.print(productArray[j] + "  ");
				} else if (j == 1) {
					System.out.print("size" + productArray[j] + "  ");
				} else if (j == 2) {
					if (productArray[j] instanceof Boolean) {
						boolean goreTex = (Boolean) productArray[j];
						if (goreTex) {
							System.out.print("Goretex" + "  ");
						} else {
							System.out.print("No Goretex" + "  ");
						}
					} else {
						System.out.print(productArray[j] + "grams/shoe" + "  ");
					}
				}
//				System.out.format(productArray[j] + "  ");
			}
		}
	}
}

class Walking extends Shoe {
	public final boolean goreTex;

	Walking(String shoeBrand, double shoeSize, boolean goreTex) {
		super(shoeBrand, shoeSize);
		this.goreTex = goreTex;
	}
}

class Running extends Shoe {
	public final double weight;

	Running(String shoeBrand, double shoeSize, double weight) {
		super(shoeBrand, shoeSize);
		this.weight = weight;
	}
}
