package lab1_4;
import java.util.Scanner;
public class lab1_4 {
	public static void main (String[]args) {
		Scanner input= new Scanner(System.in);
		
		System.out.printf("Enter score:");
		int score= input.nextInt();
		
		String grade;
		if (score>=80) {
			grade="A";
		}else if (score>=70) {
			grade="B";
		}else if (score>=60) {
			grade="C";
		}else if (score>=50) {
			grade="D";
		}else {
			grade="F";
		}
		System.out.printf("grade : %s",grade);
		input.close();
		
	}
}
