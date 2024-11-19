package packageone;

import java.util.Scanner;

public class AngryProfessor {
	static boolean classHoldOrNot(int k, int timeArray[]){
		boolean cancelled = false;
		int early = 0;
		
		for(int t: timeArray) {
			if(t <= 0)
				early++;
		}
		
		if(early >= k)
			cancelled = true;
				
		return cancelled;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T, studentNum, threshold;
		
		while(true) {
			System.out.print("Number of test cases: ");
			T = in.nextInt();
			
			if(T >= 1 && T < 11)
				break;
			
			System.err.println("Invalid! Test case number is between 1 and 10");
		}
		
		for(int i = 0; i < T; i++) {
			// i == number of test cases (T). Loop runs T times
			while(true) {
				System.out.print("Enter (No. of Students ' ' Cancelation threshold): ");
				studentNum = in.nextInt();
				threshold = in.nextInt();
				String empty = in.nextLine();
				
				if(studentNum <= 0 || studentNum > 1000)
					System.err.println("Number of students between 1 and 1000");
				else if(threshold < 0 || threshold > studentNum)
					System.err.println("Cancelation threshold cannot be greater than number of students");
				else
					break;
			}
			
			String[] time;
			int[] timeInt = new int[studentNum];
					
			while(true) {
				System.out.print("Enter various time each student arrived: ");
				time = in.nextLine().split(" ");
				
				if(time.length == studentNum)
					break;
				
				System.err.println("Time input must be equal to the number of students");
								
			}
			
			for(int j = 0; j < time.length; j++) {
				timeInt[j] = Integer.parseInt(time[j]);
			}
			
			boolean res = classHoldOrNot(threshold, timeInt);
			String result = res? "NO" : "YES";
			System.out.println("Class Cancelled: " + result);
		}
				
	}
}
