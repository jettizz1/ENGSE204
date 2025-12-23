package lab3;
import java.util.Scanner;
class DatabaseConnectionname {
	private String connectionString;
	private boolean connected;
	public DatabaseConnectionname(String connectionString) {
		this.connectionString = connectionString;
		this.connected = false;
	}
	
	public boolean isConnected() {
		return connected;
	}
	
	public void connecttti() {
		if (connected == false){
			this.connected = true;
			System.out.println("Connected to " + this.connectionString);
		} else {
			System.out.println("Already connected.");
		}
	}
	
	public void disconnecttti() {
		if (connected == true) {
			this.connected = false;
			System.out.println("Disconnected.");
		} else {
			System.out.println("Already Disconnected.");
		}
	}
}

public class lab3_5 {
	public static void main(String[] args) {
		Scanner scannerrol = new Scanner(System.in);
		String connectionStringinput = scannerrol.nextLine();
		DatabaseConnectionname db = new DatabaseConnectionname(connectionStringinput);
		
		db.connecttti();
		db.disconnecttti();
		db.disconnecttti();
		System.out.println(db.isConnected());
		scannerrol.close();
	}
}
