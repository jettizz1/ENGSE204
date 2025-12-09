package lab1_6;
import java.util.Scanner;
public class lab1_6 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		int user = input.nextInt();
		for (int i = 1; i <= 12; i++ ) {
			System.out.printf("%d x %d = %d\n", user, i, (user * i));
		}//End for
		input.close();
	}//End Main
}
