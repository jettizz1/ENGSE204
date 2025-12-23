package lab2_7;
import java.util.Scanner;
class BankAccountt {
    String OwnernameUser;
    double balance;
    BankAccountt(String OwnernameUser, double initialBalance) {
        this.OwnernameUser = OwnernameUser;
        this.balance = initialBalance;
    }
    void Withdrawmaxxi(double amount) {
        if (amount <= balance) {
            balance -= amount;  
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class lab2_7 {
    public static void main(String[] args) {
        Scanner ScannerUser = new Scanner(System.in);
        String OwnernameUser = ScannerUser.nextLine();
        double initialBalance = ScannerUser.nextDouble();
        double WithdrawAmountoneeza = ScannerUser.nextDouble();
        double WithdrawAmounttwozaa = ScannerUser.nextDouble();
        BankAccountt AccountUser = new BankAccountt(OwnernameUser, initialBalance);
        AccountUser.Withdrawmaxxi(WithdrawAmountoneeza);
        AccountUser.Withdrawmaxxi(WithdrawAmounttwozaa);
        AccountUser.displayBalance();
        ScannerUser.close();
    }
}