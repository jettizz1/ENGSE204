package lab1_7;
import java.util.Scanner;
public class lab1_7 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int noob = input.nextInt();
		int sum = 0;
		for (int i = 0; i < noob; i++) {
			int Number = input.nextInt();
			sum += Number;
		}//End For
		System.out.println(sum);
		input.close();
	}//End main
}
