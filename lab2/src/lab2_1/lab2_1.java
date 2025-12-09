package lab2_1;
import java.util.Scanner;
public class lab2_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		class Studentuser {
		    String StudentId;
		    String name;
		}		
		String id = s.nextLine();
		String n = s.nextLine();
		Studentuser stk = new Studentuser();
        stk.StudentId = id;
        stk.name = n;

        System.out.println(stk.StudentId);
        System.out.println(stk.name);

        s.close();
    }
}