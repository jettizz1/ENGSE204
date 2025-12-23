package lab4;
import java.util.Scanner;
class AuditRecorddait {
    private final String Userr;
    private final String[] LogMessagess;

    private static int MaxMessagess = 3;

    public AuditRecorddait(String Userr) {
        this.Userr = Userr;
        this.LogMessagess = new String[0];
    }

    public AuditRecorddait(String Userr, String[] Logss) {
        this.Userr = Userr;
        this.LogMessagess = new String[Logss.length];
        for (int I = 0; I < Logss.length; I++) {
            this.LogMessagess[I] = Logss[I];
        }
    }

    public static void setMaxMessages(int MAX) {
        if (MAX > 0) {
            MaxMessagess = MAX;
            System.out.println("Policy set to " + MAX);
        } else {
            System.out.println("Invalid policy.");
            
            
        }
    }

    public AuditRecorddait addMessage(String MESSAGE) {
        if (LogMessagess.length >= MaxMessagess) {
            System.out.println("Log is full.");
            
            return this;
        }

        String[] NEWLOGS = new String[LogMessagess.length + 1];
        for (int I = 0; I < LogMessagess.length; I++) {
            NEWLOGS[I] = LogMessagess[I];
        }
        NEWLOGS[NEWLOGS.length - 1] = MESSAGE;

        System.out.println(MESSAGE + " added.");
        return new AuditRecorddait(Userr, NEWLOGS);
    }

    public void displayLog() {
        StringBuilder SB = new StringBuilder();
        SB.append("User: ").append(Userr)
          .append(", Logs: ").append(LogMessagess.length)
          .append(" [");
        for (int I = 0; I < LogMessagess.length; I++) {
            SB.append(LogMessagess[I]);
            if (I < LogMessagess.length - 1) SB.append(", ");
        }
        SB.append("]");
        System.out.println(SB.toString());
    }
}

public class lab4_15 {
    public static void main(String[] ARGS) {

        Scanner Scannerti = new Scanner(System.in);

        int Maxxi = Integer.parseInt(Scannerti.nextLine().trim());
        AuditRecorddait.setMaxMessages(Maxxi);

        String Usereiei = Scannerti.nextLine();
        int N = Integer.parseInt(Scannerti.nextLine().trim());

        AuditRecorddait Record = new AuditRecorddait(Usereiei);

        for (int I = 0; I < N; I++) {
            String CMD = Scannerti.nextLine();
            if (CMD.equals("SET_POLICY")) {
                int NEWMAX = Integer.parseInt(Scannerti.nextLine().trim());
                AuditRecorddait.setMaxMessages(NEWMAX);
            } else {
                Record = Record.addMessage(CMD);
            }
        }

        Record.displayLog();
        Scannerti.close();
    }
}