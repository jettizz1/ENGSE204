package lab5;
import java.util.Scanner;
class Employeeiei {
	protected double salary;
	public double calculateBonus() {
		return this.salary * 0.10;
	}
}

class Manager extends Employeeiei {
	
	@Override
	public double calculateBonus() {
		double baseBonus = super.calculateBonus();
		double extraBonus = this.salary * 0.05;
		return baseBonus + extraBonus;
	}
}

public class lab5_3 {
	public static void main(String[] args) {
		Scanner scannerti = new Scanner(System.in);
		if (scannerti.hasNextDouble()) {
			double salary = scannerti.nextDouble();
			Manager mgrti = new Manager();
			mgrti.salary = salary;
			System.out.println(mgrti.calculateBonus());
		}
		scannerti.close();
	}
}