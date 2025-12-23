package lab4;
import java.util.Scanner;
class Productti {
	private String name;
	private double price;
	public Productti(String name) {
		this(name, 0.0);
	}
	
	public Productti(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void displayInfo() {
		System.out.println("Product: " + this.name + ", Price: " + this.price);
	}
}

public class lab4_2 {
	public static void main(String[] args) {
		Scanner scannerra = new Scanner(System.in);
		if (!scannerra.hasNextInt());
		int mode = scannerra.nextInt();
		scannerra.nextLine();
		if (mode == 1) {
			String name = scannerra.nextLine();
			Productti pp = new Productti(name);
			pp.displayInfo();
		} else if (mode == 2) {
			String name = scannerra.nextLine();
			double price = scannerra.nextDouble();
			Productti pp = new Productti(name, price);
			pp.displayInfo();
		}
		scannerra.close();
	}
}
