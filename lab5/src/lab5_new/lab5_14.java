package lab5_new;
import java.util.Scanner;

class Shippingigi {
	protected String trackingId;
	protected double baseFee;
	
	public Shippingigi(String trackingId, double baseFee) {
		this.trackingId = trackingId;
		this.baseFee = baseFee;
	}
	
	public double calculateTotalFee() {
		return baseFee;
	}
}

class StandardShippingigi extends Shippingigi {
	
	public StandardShippingigi(String id, double baseFee) {
		super(id, baseFee);
	}
	@Override
	public double calculateTotalFee() {
		return baseFee * 1.05;
	}
}

class PremiumShipping extends Shippingigi {
	protected double insuranceFee;
	
	public PremiumShipping(String id, double baseFee, double insuranceFee) {
		super(id, baseFee);
		this.insuranceFee = insuranceFee;
	}
	@Override
	public double calculateTotalFee() {
		return super.calculateTotalFee() + insuranceFee;
	}
}

public class lab5_14 {

	public static void main(String[] args) {
		Scanner scannerqw = new Scanner(System.in);
		if (scannerqw.hasNext()) {
			String sIdd = scannerqw.next();
			double sFeei = scannerqw.nextDouble();
			String pIdi = scannerqw.next();
			double pFeei = scannerqw.nextDouble();
			double pInss = scannerqw.nextDouble();
			StandardShippingigi standard = new StandardShippingigi(sIdd, sFeei);
			PremiumShipping premium = new PremiumShipping(pIdi, pFeei, pInss);
			Shippingigi[] shipments = {standard, premium};
			for (Shippingigi s : shipments) {
				System.out.println(s.calculateTotalFee());
			}
		}
		scannerqw.close();
	}
}
