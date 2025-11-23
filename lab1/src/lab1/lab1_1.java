package lab1;
import java.util.Scanner;
public class lab1_1 {
	public static void main(String[] args) {
        int userNumberoneza;
        int userNumbertwooza;
        Scanner input = new Scanner(System.in);
        userNumberoneza = input.nextInt();
        userNumbertwooza = input.nextInt();
        System.out.println(userNumberoneza + userNumbertwooza);
        input.close();
    }
}

