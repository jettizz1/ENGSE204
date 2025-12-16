package lab3;
import java.util.Scanner;
class Producttti {
	private String name;
	private static int productttiCount = 0;
	public Producttti(String name) {
        this.name = name;
        Producttti.productttiCount++;
    }
	
	public String getName() {
		return this.name;
	}
	
	public static int getProductCount() {
		return Producttti.productttiCount;
	}
}

public class lab3_4 {
	public static void main(String[] args) {
		Scanner scanneruser = new Scanner(System.in);
		
		int N = scanneruser.nextInt();
		for (int i = 0; i < N; i++) {
			
			String productname = scanneruser.next();
			new Producttti(productname);
		}
		
		System.out.println( Producttti.getProductCount());
		scanneruser.close();
	}
}
