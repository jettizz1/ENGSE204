package lab4;
import java.util.Scanner;
class Movievi {
	private String title;
	private String director;
	private double rating;
	
	public Movievi(String title) {
		this(title, "Unknown");
	}
	
	public Movievi(String title, String director) {
		this(title, director, 0.0);
	}
	
	public Movievi(String title, String director, double rating) {
		this.title = title;
		this.director = director;
		if (rating < 0.0) {
			this.rating = 0.0;
		} else if (rating > 10.0) {
			this.rating = 10.0;
		} else {
			this.rating = rating;
		}
	}
	
	public void displayDetails() {
		System.out.println("Title: " + this.title + ", Director: " + this.director + ", Rating: " + this.rating);
	}
}

public class lab4_8 {
	public static void main(String[] args) {
		Scanner scannerq = new Scanner(System.in);
		if (!scannerq.hasNextInt());
		int mode = scannerq.nextInt();
		scannerq.nextLine();
		Movievi movievi = null;
		if (mode == 1) {
			String title = scannerq.nextLine();
			movievi = new Movievi(title);
		} else if (mode == 2) {
			String title = scannerq.nextLine();
			String director = scannerq.nextLine();
			movievi = new Movievi(title, director);
		} else if (mode == 3) {
			String title = scannerq.nextLine();
			String director = scannerq.nextLine();
			if (scannerq.hasNextDouble()) {
				double rating = scannerq.nextDouble();
				movievi = new Movievi(title, director, rating);
			}
		}
		if (movievi != null) {
			movievi.displayDetails();
		}
		scannerq.close();
	}
}
