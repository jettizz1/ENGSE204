package lab2_2;
import java.util.Scanner;
public class lab2_2 {
	public static void main(String[] args) {
		class Studentuser {
			String  studentId;
			String name;
			
			void displayInfo() {
				System.out.println(studentId);
				System.out.println(name);
				
		}
		
}
			Scanner sk = new Scanner(System.in);
			Studentuser stk = new Studentuser();
			
			stk.studentId = sk.nextLine();
			stk.name = sk.nextLine();
			
			stk.displayInfo();
			
			sk.close();
		}
}
	