package lab2_3;
import java.util.Scanner;

class Studenttti {
    String studentId;
    String name;
    static int studentCount = 0;

    Studenttti(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        studentCount++;
    }
}

public class lab2_3 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        int n = sk.nextInt();
        sk.nextLine();

        for (int i = 0; i < n; i++) {
            String id = sk.nextLine();
            String name = sk.nextLine();
            new Studenttti(id, name);
        }

        System.out.println(Studenttti.studentCount);

        sk.close();
    }
}			