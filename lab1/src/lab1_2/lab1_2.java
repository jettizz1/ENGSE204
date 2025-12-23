package lab1_2;
import java.util.Scanner;
public class lab1_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float numberone = input.nextFloat();
		float numbertwoo = input.nextFloat();
		System.out.println( numberone * numbertwoo );
		input.close();
	}//END MAIN
}