package lab1_8;
import java.util.Scanner;
public class lab1_8 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int arrayone = input.nextInt();
		int [] allarray = new int [arrayone];
		for (int i = 0; i < allarray.length; i++) {
			int arraynum = input.nextInt();
			allarray[i] = arraynum;
		}//End For Loop
		
		int minlove = allarray[0];
		for (int i = 1; i < allarray.length; i++) {
			if (allarray[i] > minlove) {
				minlove = allarray[i];
			}//End If
		}//End For Loop
		System.out.println(minlove);
		input.close();
	}//End Main
}
