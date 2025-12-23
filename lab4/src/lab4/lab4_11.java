package lab4;
import java.util.Scanner;
class Configurationnvi {
    private final String THEME;
    private final int FONTSIZE;
    private final boolean DARKMODE;
    public Configurationnvi(String THEME, int FONTSIZE, boolean DARKMODE) {

        if (FONTSIZE < 10) FONTSIZE = 10;
        if (FONTSIZE > 20) FONTSIZE = 20;

        this.THEME = THEME;
        this.FONTSIZE = FONTSIZE;
        this.DARKMODE = DARKMODE;
    }

    public Configurationnvi(Configurationnvi BASE, Configurationnvi USER) {
        this(
            USER.THEME,
            BASE.FONTSIZE,
            USER.DARKMODE
        );
    }

    public void displaySettings() {
        System.out.println("Theme: " + THEME + ", Size: " + FONTSIZE + ", Dark: " + DARKMODE);
    }
}

public class lab4_11 {
    public static void main(String[] ARGS) {

        Scanner Scannerjk = new Scanner(System.in);

        String BaseThemee = Scannerjk.nextLine();
        int BaseSize = Integer.parseInt(Scannerjk.nextLine());
        boolean BaseDarkk = Boolean.parseBoolean(Scannerjk.nextLine());

        String UserThemee = Scannerjk.nextLine();
        int UserSize = Integer.parseInt(Scannerjk.nextLine());
        boolean UserDarkk = Boolean.parseBoolean(Scannerjk.nextLine());

        Configurationnvi BASECONFIG = new Configurationnvi(BaseThemee, BaseSize, BaseDarkk);
        Configurationnvi USERCONFIG = new Configurationnvi(UserThemee, UserSize, UserDarkk);

        Configurationnvi FinalConfigg = new Configurationnvi(BASECONFIG, USERCONFIG);

        FinalConfigg.displaySettings();

        Scannerjk.close();
    }
}