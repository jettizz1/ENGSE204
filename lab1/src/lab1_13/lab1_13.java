package lab1_13;
import java.util.Scanner;
public class lab1_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int K = input.nextInt();
		int J = input.nextInt();
		int [][] grid = new int[K][J];
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < J; j++) {
				grid[i][j] = input.nextInt();
			}//End For (J)
		}//End For (K)
		int nubonline = 0;
		for (int i = 0; i < K; i++) {
			for (int j = 0; i < J; i++) {
				if (grid[i][j] == 1) {
					nubonline++;
				}//End IF
			}//End For (J)
		}//End For (K)
		System.out.println(nubonline);
		input.close();
	}//End Main
}
