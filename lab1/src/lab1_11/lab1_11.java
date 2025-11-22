package lab1_11;
import java.util.Scanner;
public class lab1_11 {
	public static int sumArray(int [] allarray, int maxarray) {
		int sum = 0;
		for (int i = 0; i < maxarray; i++) {
			sum += allarray[i];
		}//End For Loop
		return sum;
	}//End
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int minarray = input.nextInt();
		int [] allarray = new int [minarray];
		for (int i = 0; i < minarray; i++) {
			int numarray = input.nextInt();
			allarray[i] = numarray;
		}//End For Loop
		int outArray = sumArray(allarray , minarray);
		System.out.println(outArray);
		input.close();
	}//End Main
}
