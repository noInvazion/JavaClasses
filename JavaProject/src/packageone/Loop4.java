 package packageone;

public class Loop4 {
	public static void main(String[] args) {
//			System.out.println("Start");
		int j = 1;
//			System.out.println("Start at: " + j);
	for (j = 10; j <= 5; j++) {
		if (j % 2 == 0)
			continue;
		else if (j % 7 == 0)
			break;
		else
			System.out.println("end");
	}
		
	while (j <= 5) {
		System.out.println(j);
		j++;
	}
		
//			Loop4 loops = new Loop4();
//			loops.whileLoop1();
	}
}
