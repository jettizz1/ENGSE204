package lab3_2;
import java.util.Scanner;
	class PlayerUserr {
		private int score;
		
		public PlayerUserr(int score) {
			this.score = score;
		}
		
		public int getScoreGola() {
			return this.score;
		}
		
		public void setScore(int newScore) {
			this.score = newScore;
		}
		public static void main(String[] args) {
			Scanner Newscanner = new Scanner(System.in);
			System.out.print("Enter Score: ");
			int scoreinput = Newscanner.nextInt();
			System.out.print("Enter New Score: ");
			int newscoreinput = Newscanner.nextInt();
			PlayerUserr playerZeroonee = new PlayerUserr(scoreinput);
			playerZeroonee.setScore(newscoreinput);
			System.out.println("-------Output-------");
			System.out.println("Score: " + playerZeroonee.getScoreGola());
			Newscanner.close();
		}
	}