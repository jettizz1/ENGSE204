package lab2_8;
import java.util.Scanner;
class TempConverterlow {
    public static double CelsiusToFahrenheit(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32;
    }
    public static double FahrenheitToCelsius(double Fahrenheit) {
        return (Fahrenheit - 32) * 5.0 / 9.0;
    }
}

public class lab2_8 {
    public static void main(String[] args) {
        Scanner ScannerOneuser = new Scanner(System.in);
        String Modetwouser = ScannerOneuser.nextLine();
        double temperature = ScannerOneuser.nextDouble();
        double result;
        if (Modetwouser.equals("C_TO_F")) {
            result = TempConverterlow.CelsiusToFahrenheit(temperature);
        } else if (Modetwouser.equals("F_TO_C")) {
            result = TempConverterlow.FahrenheitToCelsius(temperature);
        } else {
            result = temperature; 
        }
        System.out.println(result);
        ScannerOneuser.close();
    }
}
