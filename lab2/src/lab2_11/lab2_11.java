package lab2_11;
import java.util.Scanner;
class Carkhomson {
    private String model;
    private int year;
    public Carkhomson(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModelll() {
        return model;
    }
    public int GetYearrr() {
        return year;
    }
    public void SetYearrr(int newYear) {
        this.year = newYear;
    }
}
public class lab2_11 {
    public static void main(String[] args) {
        Scanner ScanneruserHonda = new Scanner(System.in);
        String model = ScanneruserHonda.nextLine();
        int year = ScanneruserHonda.nextInt();
        int NewYearrry = ScanneruserHonda.nextInt();
        Carkhomson car = new Carkhomson(model, year);
        car.SetYearrr(NewYearrry);
        System.out.println("Model: " + car.getModelll());
        System.out.println("Year: " + car.GetYearrr());
        ScanneruserHonda.close();
    }
}