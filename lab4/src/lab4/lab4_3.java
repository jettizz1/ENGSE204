package lab4;
import java.util.Scanner;
class Playerra {
	private String username;
	private int level;
	public Playerra() {
		this.username = "Guest";
		this.level = 1;
	}
	
	public Playerra(String username, int level) {
		this.username = username;
		this.level = level;
	}
	
	public void displayProfile() {
		System.out.print("User: " + this.username + ", Level: " + this.level);
	}
}

public class lab4_3 {
	public static void main(String[] args) {
		Scanner scannerrt = new Scanner(System.in);
		if (!scannerrt.hasNextInt());
		int mode = scannerrt.nextInt();
		scannerrt.nextLine();
		if (mode == 1) {
			Playerra ppi = new Playerra();
			ppi.displayProfile();
		} else if (mode == 2) {
			String username = scannerrt.nextLine();
			int level = scannerrt.nextInt();
			Playerra ppi = new Playerra(username, level);
			ppi.displayProfile();
		}
		scannerrt.close();
	}
}
