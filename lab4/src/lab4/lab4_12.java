package lab4;
import java.util.Scanner;
class Scheduleeiei {
    private int Hour;
    public Scheduleeiei(int Hour) {
        this.Hour = Hour;
    }

    public void setHour(int NewHour) {
        this.Hour = NewHour;
    }

    public int getHour() {
        return Hour;
    }

    public Scheduleeiei(Scheduleeiei OTHER) {
        this.Hour = OTHER.Hour;
    }
}

class EmployeeSchedule {
    private String NAME;
    private Scheduleeiei SCHEDULE;

    public EmployeeSchedule(String NAME, Scheduleeiei SCHEDULE) {
        this.NAME = NAME;
        this.SCHEDULE = SCHEDULE;
    }

    public EmployeeSchedule(EmployeeSchedule OTHER) {
        this.NAME = OTHER.NAME;
        this.SCHEDULE = new Scheduleeiei(OTHER.SCHEDULE);
    }

    public void displaySchedule() {
        System.out.println(NAME + ": " + SCHEDULE.getHour() + ":00");
    }
}

public class lab4_12 {
    public static void main(String[] ARGS) {

        Scanner Scanneraa = new Scanner(System.in);

        String Name = Scanneraa.nextLine();
        int Hour = Integer.parseInt(Scanneraa.nextLine());
        int NewHour = Integer.parseInt(Scanneraa.nextLine());

        Scheduleeiei ScHone = new Scheduleeiei(Hour);

        EmployeeSchedule EMP1 = new EmployeeSchedule(Name, ScHone);
        EmployeeSchedule EMP2 = new EmployeeSchedule(EMP1);

        ScHone.setHour(NewHour);

        EMP1.displaySchedule();
        EMP2.displaySchedule();

        Scanneraa.close();
    }
}