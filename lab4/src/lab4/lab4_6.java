package lab4;
import java.util.Scanner;
class Pointti {
	private final int x;
	private final int y;
	
	public Pointti(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public Pointti move(int dx, int dy) {
		int newX = this.x + dx;
		int newY = this.y + dy;
		return new Pointti(newX, newY);
	}
	
	public void displayInfo() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
}

public class lab4_6 {
	public static void main(String[] args) {
		Scanner scannerrk = new Scanner(System.in);
		if (!scannerrk.hasNextInt());
		int x = scannerrk.nextInt();
		int y = scannerrk.nextInt();
		int dx = scannerrk.nextInt();
		int dy = scannerrk.nextInt();
		
		Pointti pone = new Pointti(x, y);
		Pointti ptwo = pone.move(dx, dy);
		Pointti pthere = ptwo.move(dx, dy);
		pone.displayInfo();
		ptwo.displayInfo();
		pthere.displayInfo();
		scannerrk.close();
	}
}
