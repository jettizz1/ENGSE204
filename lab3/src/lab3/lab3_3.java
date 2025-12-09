package lab3;
import java.util.Scanner;
	class Usernamee {
			private String password;
			
			public Usernamee(String initialpassword) {
				this.password = initialpassword;
			}
			
			public String getPasswordddi() {
				return this.password;
			}
			
			public void setPassword(String newPassword) {
				if (newPassword.length() >= 8) {
					this.password = newPassword;
					System.out.println("Password update.");
				} else {
					System.out.println("Password is too short.");
				}
			}
		}

		public class lab3_3 {

			public static void main(String[] args) {
				Scanner scannerrol = new Scanner(System.in);
				
				String initialPasswordinputtti = scannerrol.nextLine();
				
				String newPasswordinputtti = scannerrol.nextLine();
				Usernamee userProfile = new Usernamee(initialPasswordinputtti);
				
				userProfile.setPassword(newPasswordinputtti);
				System.out.println( userProfile.getPasswordddi());
				scannerrol.close();
			}
	}