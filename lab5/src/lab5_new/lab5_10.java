package lab5_new;
import java.util.Scanner;

class ProjectTaskiki {
	protected String description;
	protected int baseHours;
	
	public ProjectTaskiki(String description, int baseHours) {
		this.description = description;
		this.baseHours = baseHours;
	}
	
	public double calculateCost() {
		return baseHours * 50.0;
	}
}

class ComplexTask extends ProjectTaskiki {
	protected double setupFee;
	
	public ComplexTask(String description, int baseHours, double setupFee) {
		super(description, baseHours);
		this.setupFee = setupFee;
	}
	@Override
	public double calculateCost() {
		return (super.calculateCost() * 1.10) + setupFee;
	}
}

class SimpleTaskiki extends ProjectTaskiki {
	public SimpleTaskiki(String description, int baseHours) {
		super(description, baseHours);
	}
	@Override
	public double calculateCost() {
		return super.calculateCost();
	}
}

public class lab5_10 {

	public static void main(String[] args) {
		Scanner scannermx = new Scanner(System.in);
		if (scannermx.hasNextLine()) {
			String cDesc = scannermx.nextLine();
			int cHours = scannermx.nextInt();
			double cFee = scannermx.nextDouble();
			scannermx.nextLine();
			String sDesc = scannermx.nextLine();
			int sHours = scannermx.nextInt();
			ComplexTask complex = new ComplexTask(cDesc, cHours, cFee);
			SimpleTaskiki simple = new SimpleTaskiki(sDesc, sHours);
			ProjectTaskiki[] tasks = {complex, simple};
			for (ProjectTaskiki task : tasks) {
				System.out.println(task.calculateCost());
			}
		}
		scannermx.close();
	}
}
