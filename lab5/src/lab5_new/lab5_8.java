package lab5_new;
import java.util.Scanner;

class Personini {
	protected String name;
	
	public Personini(String name) {
		this.name = name;
	}
	
	public String getStatus() {
		return "Person: " + name;
	}
}

class Student extends Personini {
	protected int studentId;
	
	public Student(String name, int studentId) {
		super(name);
		this.studentId = studentId;
	}
	@Override
	public String getStatus() {
		return "Student: " + name + ", ID: " + studentId;
	}
}

	class employeeid extends Personini {
	protected double salary;
	
	public employeeid(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	public void applyBonus(double bonus) {
		this.salary += bonus;
	}
	@Override
	public String getStatus() {
		return "Employee: " + name + ", Salary: " + salary;
	}
}

public class lab5_8 {

	public static void main(String[] args) {
		Scanner scannerqw = new Scanner(System.in);
		if (scannerqw.hasNext()) {
			String sName = scannerqw.next();
			int sId = scannerqw.nextInt();
			String eName = scannerqw.next();
			double eSalary = scannerqw.nextDouble();
			Student s = new Student(sName, sId);
			employeeid e = new employeeid(eName, eSalary);
			Personini[] people = {s, e};
			for (Personini p : people) {
				if (p instanceof employeeid) {
					employeeid emp = (employeeid) p;
					emp.applyBonus(1000.0);
				}
			}
			for (Personini p : people) {
				System.out.println(p.getStatus());
			}
		}
		scannerqw.close();
	}
}
