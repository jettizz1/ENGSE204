package lab3;
import java.util.Scanner;
class Userr {
	private String username;
	public Userr (String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}
}

public class lab3_1 {

	public static void main(String[] args) {
		Scanner scannerrrz = new Scanner(System.in);
		String inputUsername = scannerrrz.nextLine();
		Userr userObject = new Userr(inputUsername);
		
		System.out.println( userObject.getUsername());
		scannerrrz.close();
	}
}