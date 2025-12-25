package lab5_new;
import java.util.Scanner;

class Employee {
	protected String name;
	protected double baseSalary;
	
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public double calculatePay() {
		return baseSalary;
	}
}

class SalesEmployee extends Employee {
	protected double commissionRate;
	
	public SalesEmployee(String name, double baseSalary, double commissionRate) {
		super(name, baseSalary);
		this.commissionRate = commissionRate;
	}
	@Override
	public double calculatePay() {
		return baseSalary + (baseSalary * commissionRate);
	}
}

class PayrollProcessor {
	public static void process(Employee e) {
		System.out.println(e.name + " total pay: " + e.calculatePay());
	}
}

class Manager extends Employee {
	protected double fixedBonus;
	
	public Manager(String name, double baseSalary, double fixedBonus) {
		super(name, baseSalary);
		this.fixedBonus = fixedBonus;
	}
	
	@Override
	public double calculatePay() {
		return baseSalary + fixedBonus;
	}
}
public class lab5_7 {

	public static void main(String[] args) {
		Scanner scanneri = new Scanner(System.in);
		if (scanneri.hasNext()) {
			String sName = scanneri.next();
			double sSalary = scanneri.nextDouble();
			double sRate = scanneri.nextDouble();
			String mName = scanneri.next();
			double mSalary = scanneri.nextDouble();
			double mBonus = scanneri.nextDouble();
			SalesEmployee sales = new SalesEmployee(sName, sSalary, sRate);
			Manager manager = new Manager(mName, mSalary, mBonus);
			
			PayrollProcessor.process(sales);
			PayrollProcessor.process(manager);
		}
		scanneri.close();
	}
}