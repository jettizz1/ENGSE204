package lab1_5;
import java.util.Scanner;
public class lab1_5 {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		System.out.printf("Enter MenuNumber :");
		int MenuNumber= input.nextInt();
		input.close();
		
		if (MenuNumber == 1) {
			System.out.printf("Amerciano");
		}else if (MenuNumber == 2) {
			System.out.printf("= Latte");
		}else if (MenuNumber == 3) {
			System.out.printf("= Esprsso");
		}else if (MenuNumber == 4) {
			System.out.printf("= Mocha");
		}else {
			System.out.printf("invalid menu");
		}
		
	}
}

