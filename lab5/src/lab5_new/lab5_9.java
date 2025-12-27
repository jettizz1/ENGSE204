package lab5_new;
import java.util.Scanner;

class Itemimi {
	protected String name;
	
	public Itemimi(String name) {
		this.name = name;
	}
	
	public double getValue() {
		return 0.0;
	}
}

class PhysicalProductti extends Itemimi {
	protected double unitPrice;
	protected int quantity;
	
	public PhysicalProductti(String name, double unitPrice, int quantity) {
		super(name);
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	@Override
	public double getValue() {
		return unitPrice * quantity;
	}
}

class DigitalSubscription extends Itemimi {
	protected double monthlyCost;
	protected int months;
	public DigitalSubscription(String name, double monthlyCost, int months) {
		super(name);
		this.monthlyCost = monthlyCost;
		this.months = months;
	}
	@Override
	public double getValue() {
		return monthlyCost * months;
	}
}

public class lab5_9 {

	public static void main(String[] args) {
		Scanner scannerox = new Scanner(System.in);
		if (scannerox.hasNextLine()) {
			String pName = scannerox.nextLine();
			double pPrice = scannerox.nextDouble();
			int pQty = scannerox.nextInt();
			scannerox.nextLine();
			String dName = scannerox.nextLine();
			double dCost = scannerox.nextDouble();
			int dMonths = scannerox.nextInt();
			PhysicalProductti pp = new PhysicalProductti(pName, pPrice, pQty);
			DigitalSubscription dd = new DigitalSubscription(dName, dCost, dMonths);
			Itemimi[] items = {pp, dd};
			double totalValue = 0.0;
			for (Itemimi item : items) {
				totalValue += item.getValue();
			}
			System.out.println(totalValue);
		}
		scannerox.close();
	}
}
