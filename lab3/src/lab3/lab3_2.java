package lab3;
import java.util.Scanner;
class Playeruesr {
	private int score;
	public Playeruesr(int score) {
		this.score = score;
	}
	
	public int getScoreee() {
		return this.score;
	}
	
	public void setScoreee(int newScore) {
		this.score = newScore;
	}
}

public class lab3_2 {
	public static void main(String[] args) {
		Scanner scannerrr = new Scanner(System.in);
		int scoreinput = scannerrr.nextInt();
		int newscoreinput = scannerrr.nextInt();
		Playeruesr playerzeroone = new Playeruesr(scoreinput);
		playerzeroone.setScoreee(newscoreinput);
		System.out.println( playerzeroone.getScoreee());
		scannerrr.close();
	}
}
