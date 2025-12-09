package lab1_10;
import java.util.Scanner;
public class lab1_10 {
	public static double calculateArea(double width, double height) {
		double result = width * height;
		return result;
	}//End 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double width = input.nextDouble();
		double height = input.nextDouble();
		double sum = calculateArea(width, height);
		System.out.println(sum);
		input.close();
	}//End Main
}
