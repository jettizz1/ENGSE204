package lab5;
import java.util.Scanner;
class Vehicleiei {
	protected String color;
	public Vehicleiei(String color) {
		this.color = color;
	}
}

class Cars extends Vehicleiei {
	
	protected int wheels;
	public Cars(String color, int wheels) {
		super(color);
		this.wheels = wheels;
	}
	
	public void displayDetails() {
		System.out.println("Color: " + this.color + ", Wheels: " + this.wheels);
	}
}

public class lab5_4 {

	public static void main(String[] args) {
		Scanner Scannerti = new Scanner(System.in);
		if (Scannerti.hasNext()) {
			String colorlow = Scannerti.next();
			if (Scannerti.hasNextInt()) {
				int wheels = Scannerti.nextInt();
				Cars myCarti = new Cars(colorlow, wheels);
				myCarti.displayDetails();
			}
		}
		Scannerti.close();
	}
}