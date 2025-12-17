package lab4;
import java.util.Scanner;
class Subscriptionni {
    private final String PLANNAME;
    private final int DuratIondays;
    private static int MAXDURATION = 365;
    public Subscriptionni(String PLANNAME, int DuratIondays) {
        int Days = DuratIondays;
        if (Days > MAXDURATION) Days = MAXDURATION;
        if (Days < 0) Days = 0;
        this.PLANNAME = PLANNAME;
        this.DuratIondays = Days;
    }

    public Subscriptionni(Subscriptionni Other) {
        this.PLANNAME = Other.PLANNAME;
        this.DuratIondays = Other.DuratIondays;
    }

    public static void setMaxDuration(int MAX) {
        if (MAX <= 0) {
            System.out.println("Invalid max policy.");
            return;
        }
        MAXDURATION = MAX;
        System.out.println("Max duration set to " + MAXDURATION);
    }

    public Subscriptionni extend(int DAYS) {
        if (DAYS <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int NEWDAYS = this.DuratIondays + DAYS;

        if (NEWDAYS > MAXDURATION) {
        	System.out.println("Extension successful.");
            return this;
        }

        System.out.println("Extension successful.");
        System.out.println("Extension falied: Exceeds max policy.");
        return new Subscriptionni(this.PLANNAME, NEWDAYS);
    }

    public void displayInfo() {
        System.out.println("Plan: " + PLANNAME + ", Days: " + DuratIondays);
    }
}

public class lab4_13 {
    public static void main(String[] ARGS) {

        Scanner Scannerkk = new Scanner(System.in);

        int Max = Integer.parseInt(Scannerkk.nextLine().trim());
        Subscriptionni.setMaxDuration(Max);

        String Plan = Scannerkk.nextLine();
        int Days = Integer.parseInt(Scannerkk.nextLine().trim());
        int EXTonee = Integer.parseInt(Scannerkk.nextLine().trim());
        int EXTtwoo = Integer.parseInt(Scannerkk.nextLine().trim());

        Subscriptionni SUB = new Subscriptionni(Plan, Days);
        SUB = SUB.extend(EXTonee);
        SUB = SUB.extend(EXTtwoo);
        SUB.displayInfo();

        Scannerkk.close();
    }
}