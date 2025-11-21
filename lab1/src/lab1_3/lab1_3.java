package lab1_3;
import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่าจำนวนเต็มจากผู้ใช้
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // ตรวจสอบว่าเป็นเลขคู่หรือเลขคี่
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
