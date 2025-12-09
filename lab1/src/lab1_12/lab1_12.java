package lab1_12;
import java.util.Scanner;
public class lab1_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int limitinventoryza = input.nextInt();
		int [] productID = new int [limitinventoryza];
		int [] productStockker = new int [limitinventoryza];
		for (int i = 0; i < limitinventoryza; i++) {
			productID[i] = input.nextInt();
			productStockker[i] = input.nextInt();
		}//End For Loop
		boolean check = false;
		int searchID = input.nextInt();
		for (int i = 0; i < limitinventoryza; i++) {
			if (productID[i] == searchID) {
				System.out.println(productStockker[i]);
				check = true;
			}//End IF
		}//End For Loop
		if (!check) {
			System.out.println("product"+ searchID+"not found");
		}//End IF
		input.close();
	}//End Main
}
