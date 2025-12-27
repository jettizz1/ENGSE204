package lab5_new;
import java.util.Scanner;

class Serviceiei {
	protected String name;
	protected double basePrice;
	
	public Serviceiei(String name, double basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}
	
	public double calculateFinalPrice() {
		return basePrice;
	}
}

class BasicService extends Serviceiei {
	public BasicService(String name, double basePrice) {
		super(name, basePrice);
	}
	@Override
	public double calculateFinalPrice() {
		return basePrice * 1.05;
	}
}

class PremiumServiceiei extends Serviceiei {
	protected double premiumRate;
	
	public PremiumServiceiei(String name, double basePrice, double premiumRate) {
		super(name, basePrice);
		this.premiumRate = premiumRate;
	}
	@Override
	public double calculateFinalPrice() {
		return basePrice * (1 + premiumRate);
	}
}

public class lab5_12 {

	public static void main(String[] args) {
		Scanner scannerrir = new Scanner(System.in);
		if (scannerrir.hasNextLine()) {
			String bName = scannerrir.nextLine();
			double bPrice = scannerrir.nextDouble();
			scannerrir.nextLine(); 
			String pName = scannerrir.nextLine();
			double pPrice = scannerrir.nextDouble();
			double pRate = scannerrir.nextDouble();
			BasicService basic = new BasicService(bName, bPrice);
			PremiumServiceiei premium = new PremiumServiceiei(pName, pPrice, pRate);
			Serviceiei[] services = {basic, premium};
			for (Serviceiei s : services) {
				System.out.println(s.calculateFinalPrice());
			}
		}
		scannerrir.close();
	}
}
