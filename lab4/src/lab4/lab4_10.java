package lab4;
import java.util.Scanner;
class TimePerioddi {
    private int StartHour;
    private int EndHour;

    public TimePerioddi() {
        this(9, 17);
    }

    public TimePerioddi(int StartHour, int EndHour) {

        if (StartHour < 0) StartHour = 0;
        if (StartHour > 23) StartHour = 23;
        if (EndHour < 0) EndHour = 0;
        if (EndHour > 23) EndHour = 23;

        if (StartHour > EndHour) {
            int TEMP = StartHour;
            StartHour = EndHour;
            EndHour = TEMP;
        }

        this.StartHour = StartHour;
        this.EndHour = EndHour;
    }

    public void displayPeriod() {
        System.out.println(StartHour + ":00 - " + EndHour + ":00");
    }
}

public class lab4_10 {
    public static void main(String[] ARGS) {
        Scanner Scannerrk = new Scanner(System.in);

        int Mode = Integer.parseInt(Scannerrk.nextLine());

        TimePerioddi TimePeriod;

        if (Mode == 1) {
            TimePeriod = new TimePerioddi();
        } else {
            int Start = Integer.parseInt(Scannerrk.nextLine());
            int End = Integer.parseInt(Scannerrk.nextLine());
            TimePeriod = new TimePerioddi(Start, End);
        }

        TimePeriod.displayPeriod();

        Scannerrk.close();
    }
}
