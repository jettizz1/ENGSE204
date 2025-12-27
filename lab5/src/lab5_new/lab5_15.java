package lab5_new;
import java.util.Scanner;

class RentalVehicleiei {
	protected String model;
	protected double rentalRate;
	
	public RentalVehicleiei(String model, double rentalRate) {
		this.model = model;
		this.rentalRate = rentalRate;
	}
	
	public double calculateFee() {
		return rentalRate;
	}
}

class Car extends RentalVehicleiei {
	
	public Car(String model, double rentalRate) {
		super(model, rentalRate);
	}
	@Override
	public double calculateFee() {
		return rentalRate + 100.0;
	}
}

class Motorcycle extends RentalVehicleiei {
	
	public Motorcycle(String model, double rentalRate) {
		super(model, rentalRate);
	}
	@Override
	public double calculateFee() {
		return rentalRate * 1.10;
	}
}

public class lab5_15 {

	public static void main(String[] args) {
		Scanner Scannerss = new Scanner(System.in);
		if (Scannerss.hasNextLine()) {
			String cModelone = Scannerss.nextLine();
			double cRate = Scannerss.nextDouble();
			Scannerss.nextLine(); 
			String mModelss = Scannerss.nextLine();
			double mRate = Scannerss.nextDouble();
			Car carza = new Car(cModelone, cRate);
			Motorcycle motoo = new Motorcycle(mModelss, mRate);
			RentalVehicleiei[] vehicles = {carza, motoo};
			double totalFee = 0.0;
			for (RentalVehicleiei v : vehicles) {
				totalFee += v.calculateFee();
			}
			System.out.println(totalFee);
		}
		Scannerss.close();
	}
}
