package lab2_3;
import java.util.Scanner;
public class lab2_3 {
	public static void main(String[] args) {
		class Studentzaa {
		 String studentId;
		 String name;
		static int studentCount = 0;
			
			Studentzaa(String studentId, String name){
				this.studentId = studentId;
				this.name = name;
				studentCount++;
			}
		}	
			Scanner sk = new Scanner(System.in);
			int n = sk.nextInt();
			sk.nextLine();
			
			for (int i = 0; i < n; i++) {
				String id = sk.nextLine();
				String name = sk.nextLine();
				new Studentzaa(id,name);
			}
		
			System.out.println(Studentzaa.studentCount);
			
			sk.close();
	}
}

			