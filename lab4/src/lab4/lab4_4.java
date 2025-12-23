package lab4;
import java.util.Scanner;
class Locationni {
	private double latitude;
	private double longitude;
	public Locationni(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Locationni(Locationni other) {
		this.latitude = other.latitude;
		this.longitude = other.longitude;
	}
	
	public void setLatitude(double newLat) {
		this.latitude = newLat;
	}
	
	public void displayInfo() {
		System.out.println("Lat: " + this.latitude + ", Lon: " + this.longitude);
	}
}

public class lab4_4 {
	public static void main(String[] args) {
		Scanner scannerrol = new Scanner(System.in);
		if (!scannerrol.hasNextDouble());
		double startLat = scannerrol.nextDouble();
		double startLon = scannerrol.nextDouble();
		double newLat = scannerrol.nextDouble();
		Locationni locone = new Locationni(startLat, startLon);
		Locationni loctwoo = new Locationni(locone);
		
		locone.setLatitude(newLat);
		locone.displayInfo();
		loctwoo.displayInfo();
		scannerrol.close();
	}
}
