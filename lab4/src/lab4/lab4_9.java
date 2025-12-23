package lab4;
import java.util.Scanner;
class ImmutableAccountti {
    private final String ACCOUNTID;
    private final double BALANCE;
    public ImmutableAccountti(String ACCOUNTID, double BALANCE) {
        if (BALANCE < 0.0) BALANCE = 0.0;
        this.ACCOUNTID = ACCOUNTID;
        this.BALANCE = BALANCE;
    }

    public ImmutableAccountti(ImmutableAccountti OTHER) {
        this.ACCOUNTID = OTHER.ACCOUNTID;
        this.BALANCE = OTHER.BALANCE;
    }

    public String getAccountId() {
        return ACCOUNTID;
    }

    public double getBalance() {
        return BALANCE;
    }

    public ImmutableAccountti deposit(double AMOUNT) {
        if (AMOUNT <= 0.0) {
            System.out.println("Invalid deposit amount.");
            return this;
        }
        return new ImmutableAccountti(ACCOUNTID, BALANCE + AMOUNT);
    }

    public ImmutableAccountti withdraw(double AMOUNT) {
        if (AMOUNT > BALANCE) {
        	
            System.out.println("Insufficient funds.");
            return this;
        }
        if (AMOUNT <= 0.0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        }
        return new ImmutableAccountti(ACCOUNTID, BALANCE - AMOUNT);
    }

    public void displayInfo() {
        System.out.println("ID: " + ACCOUNTID + ", Balance: " + BALANCE);
    }
}

public class lab4_9 {
    public static void main(String[] ARGS) {
        Scanner Scanner = new Scanner(System.in);

        String ID = Scanner.nextLine();
        double BALANCE = Double.parseDouble(Scanner.nextLine());
        double DEPOSIT = Double.parseDouble(Scanner.nextLine());
        double WITHDRAW = Double.parseDouble(Scanner.nextLine());

        ImmutableAccountti ACC1z = new ImmutableAccountti(ID, BALANCE);
        ImmutableAccountti ACC2s = ACC1z.deposit(DEPOSIT);
        ImmutableAccountti ACC3a = ACC2s.withdraw(WITHDRAW);

        ACC1z.displayInfo();
        ACC3a.displayInfo();

        Scanner.close();
    }
}