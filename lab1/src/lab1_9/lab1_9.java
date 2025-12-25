package lab1_9;
import java.util.Scanner;
public class lab1_9 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int arrayuser = input.nextInt();
		int [] allarray = new int [arrayuser];
		for (int i = 0; i < allarray.length; i++) {
			int arraynum = input.nextInt();
			allarray[i] = arraynum;
		}//End For Loop
		int sum = 0;
		for (int i = 0; i < allarray.length; i++) {
			sum += allarray[i];
		}//End For Loop
		double average = (double) sum / allarray.length;
		System.out.println(average);
		input.close();
	}//End Main
}
