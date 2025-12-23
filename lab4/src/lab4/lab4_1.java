package lab4;
import java.util.Scanner;
class Bookki {
	private String title;
	private String author;
	
	public Bookki(String title) {
		this.title = title;
		this.author = "Unknown";
	}
	
	public Bookki(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.println("Title: " + this.title + "Author: " + this.author);
	}
}

public class lab4_1 {
	public static void main(String[] args) {
		Scanner scannerr = new Scanner(System.in);
		if (!scannerr.hasNextInt());
		int mode = scannerr.nextInt();
		scannerr.nextLine();
		if (mode == 1) {
			String title = scannerr.nextLine();
			Bookki bookki = new Bookki(title);
			bookki.displayInfo();
		} else if (mode == 2) {
			String title = scannerr.nextLine();
			String author = scannerr.nextLine();
			Bookki bookki = new Bookki(title, author);
			bookki.displayInfo();
		}
		scannerr.close();
	}
}
