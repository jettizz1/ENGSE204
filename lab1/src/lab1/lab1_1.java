package lab1;
import java.util.Scanner;
public class lab1_1 {
	public static void main(String[] args) {
        int usernumber1;
        int usernumber2;
        Scanner input = new Scanner(System.in);
        usernumber1 = input.nextInt();
        usernumber2 = input.nextInt();
        System.out.println(usernumber1 + usernumber2);
        input.close();
    }
}

