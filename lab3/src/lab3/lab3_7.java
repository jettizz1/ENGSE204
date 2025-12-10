package lab3;
import java.util.Scanner;
class EmployeeId {
	private String Employeeld;
	private String department;
	
	public EmployeeId(String employeeld, String department) {
		this.Employeeld = employeeld;
		this.department = department;
	}
	
	public String getEmployeeld() {
		return Employeeld;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String newDepartment) {
		this.department = newDepartment;
	}
}

public class lab3_7 {
	public static void main(String[] args) {
		Scanner scannerrra = new Scanner(System.in);
		String inputID = scannerrra.nextLine();
		String inputInitialdept = scannerrra.nextLine();
		String inputNewdept = scannerrra.nextLine();
		EmployeeId emp = new EmployeeId(inputID, inputInitialdept);
		emp.setDepartment(inputNewdept);
		System.out.println( emp.getEmployeeld());
		System.out.println( emp.getDepartment());
		scannerrra.close();
	}
}
