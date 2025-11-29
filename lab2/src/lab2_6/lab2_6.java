package lab2_6;
import java.util.Scanner;
class BankAccount {
    String ownerNameuser;
    double balance;
    BankAccount(String ownerNameuser, double initialBalance) {
        this.ownerNameuser = ownerNameuser;
        this.balance = initialBalance;
    }
    void deposittti(double amount) {
        balance += amount;  
    }
    void displaySummaryymi() {
        System.out.println("Owneruser: " + ownerNameuser);
        System.out.println("Balance: " + balance);
    }
}
public class lab2_6 {
    public static void main(String[] args) {
        Scanner scanneruser = new Scanner(System.in);
        String ownerNameuser = scanneruser.nextLine();
        double initialBalance = scanneruser.nextDouble();
        double depositAmount = scanneruser.nextDouble();
        BankAccount account = new BankAccount(ownerNameuser, initialBalance);
        account.deposittti(depositAmount);
        account.displaySummaryymi();
        scanneruser.close();
    }
}
