package lab4;
import java.util.Scanner;
class ScoreBoarddi {
    private final String GameNamee;
    private final int[] Scoress;
    public ScoreBoarddi(String GameNamee, int[] Scoress) {
        this.GameNamee = GameNamee;
        this.Scoress = Scoress;
    }

    public ScoreBoarddi(ScoreBoarddi Other) {
        this.GameNamee = Other.GameNamee;
        this.Scoress = new int[Other.Scoress.length];
        for (int I = 0; I < Other.Scoress.length; I++) {
            this.Scoress[I] = Other.Scoress[I];
        }
    }

    public void displayScores() {
        System.out.println(GameNamee + ": " + Scoress[0] + ", " + Scoress[1] + ", " + Scoress[2]);
    }
}

public class lab4_14 {
    public static void main(String[] ARGS) {
        Scanner Scannerqw = new Scanner(System.in);

        String GameNamee = Scannerqw.nextLine();
        int[] OriginalScoress = new int[3];
        OriginalScoress[0] = Scannerqw.nextInt();
        OriginalScoress[1] = Scannerqw.nextInt();
        OriginalScoress[2] = Scannerqw.nextInt();
        int NewFirst = Scannerqw.nextInt();

        ScoreBoarddi SBonej = new ScoreBoarddi(GameNamee, OriginalScoress);
        ScoreBoarddi SBtwoj = new ScoreBoarddi(SBonej);

        OriginalScoress[0] = NewFirst;

        SBonej.displayScores();
        SBtwoj.displayScores();

        Scannerqw.close();
    }
}