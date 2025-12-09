package lab3;
import java.util.Scanner;
class BankAccounttti {
	private double balance;
	public BankAccounttti(double initialBalance) {
		if (initialBalance >= 0) {
			this.balance = initialBalance;
		} else {
			this.balance = 0;
		}
	}
	public double GetBalanceee() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Deposit susccessful.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount.");
		} else if (amount > this.balance) {
			System.out.println("Insufficient funds.");
		} else {
			this.balance -= amount;
			System.out.println("Withdrawal successful.");
		}
	}
}
public class lab3_6 {
	public static void main(String[] args) {
		Scanner scannerrolax = new Scanner(System.in);
		double initialBalanceinput = scannerrolax.nextDouble();
		double depositAmountinput = scannerrolax.nextDouble();
		double withdrawAmountinput = scannerrolax.nextDouble();
		BankAccounttti account = new BankAccounttti(initialBalanceinput);
		account.deposit(depositAmountinput);
		account.withdraw(withdrawAmountinput);
		System.out.println("Final Balance: " + account.GetBalanceee());
		scannerrolax.close();
	}
}
