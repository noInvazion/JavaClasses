package packageone;

import java.util.Scanner;

public class BankAccount {
	int accountBalance;
	
	BankAccount(int initialBalance) {
		
		if (initialBalance >= 0) {
			accountBalance = initialBalance;
		}else {
			accountBalance = 0;
			System.out.println("This initial balance is invalid.");
		}
	}
	
		void creditAmount() {
			Scanner sc = new Scanner(System.in);
			System.out.println("How much do you want to deposit: ");
			int amountInserted = sc.nextInt();
			if (amountInserted < 0) {
				System.err.println("invalid amount.");
			}else {
				accountBalance += amountInserted;
			}
			
			
		}
	
		void debitAmount() {
			Scanner sc = new Scanner(System.in);
			System.out.println("How much do you want to withdraw: ");
			float amountWithdrawn = sc.nextFloat();
			if (amountWithdrawn > accountBalance) {
				System.err.println("Debit ammount exceed account balance!");
			} else {
				accountBalance -= amountWithdrawn;
				System.out.println("You have withdrawn" + amountWithdrawn + ". You have" + accountBalance + "left");
	
			}
		}
	
		void getBalance() {
			System.out.println("Your account balance is" + accountBalance);
		}

	public static void main(String args[]) {
		BankAccount bank = new BankAccount(500);
		bank.creditAmount();

	}
}