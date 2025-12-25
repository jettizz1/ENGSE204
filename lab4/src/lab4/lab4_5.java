package lab4;
import java.util.Scanner;

class Colormax {
	private int red;
	private int green;
	private int blue;
	
	public Colormax(int r, int g, int b) {
		if (r < 0) {
			this.red = 0;
		} else if (r > 255) {
			this.red = 255;
		} else {
			this.red = r;
		}
		
		if (g < 0) {
			this.green = 0;
		} else if (g > 255) {
			this.green = 255;
		} else {
			this.green = g;
		}
		
		if (b < 0) {
			this.blue = 0;
		} else if (b > 255) {
			this.blue = 255;
		} else {
			this.blue = b;
		}
	}
	
	public int getRed() {
		return this.red;
	}
	
	public int getGreen() {
		return this.green;
	}
	
	public int getBlue() {
		return this.blue;
	}
	
	public void displayRGB() {
		System.out.println("R = " + this.red + ", G = " + this.green + ", B = " + this.blue);
	}
}

public class lab4_5 {
	public static void main(String[] args) {
		Scanner scannerrox = new Scanner(System.in);
		if (scannerrox.hasNextInt()) {
			int r = scannerrox.nextInt();
			int g = scannerrox.nextInt();
			int b = scannerrox.nextInt();
			
			Colormax myColor = new Colormax(r, g, b);
			myColor.displayRGB();
		}
		scannerrox.close();
	}
}
