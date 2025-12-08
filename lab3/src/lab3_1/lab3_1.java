package lab3_1;
import java.util.Scanner;
	class Userrr {
	    private String username;
	    public Userrr(String username) {
	        this.username = username;
	    }
	    
	    public String getUsername() {
	        return username;
	    }
	}
	public class lab3_1 {
		public static void main(String[] args) {
	        java.util.Scanner scannerzrr = new java.util.Scanner(System.in);
	        String input = scannerzrr.nextLine();
	        Userrr userrr = new Userrr(input);
	        System.out.println(userrr.getUsername());
	        scannerzrr.close();
	    }
	}