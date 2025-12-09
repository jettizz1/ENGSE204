package lab3;
import java.util.Scanner;
class Playeruesr {
	private int score;
	public Playeruesr(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int newScore) {
		this.score = newScore;
	}
}

public class lab3_2 {
	public static void main(String[] args) {
		Scanner scannerrr = new Scanner(System.in);
		System.out.print("Enter Score: ");
		int scoreinput = scannerrr.nextInt();
		System.out.print("Enter New Score: ");
		int newscoreinput = scannerrr.nextInt();
		Playeruesr playerzeroone = new Playeruesr(scoreinput);
		playerzeroone.setScore(newscoreinput);
		
		System.out.println("-------Output-------");
		System.out.println("Score: " + playerzeroone.getScore());
		scannerrr.close();
	}
}
