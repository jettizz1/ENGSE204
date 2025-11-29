package lab2_4;
import java.util.Scanner;

class Student {

    String nameee;
    int midtermScore;
    int finalScore;


    Student(String name, int midtermScore, int finalScore) {
        this.nameee = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }

    void displaySummary() {
        double avg = calculateAverage();
        String status = (avg >= 50.0) ? "Pass" : "Fail";

        System.out.println("Name: " + nameee);
        System.out.println("Average Score: " + avg);
        System.out.println("Status: " + status);
    }
}

public class lab2_4 {
    public static void main(String[] args) {

        Scanner sk = new Scanner(System.in);

        String name = sk.nextLine();
        int mid = sk.nextInt();
        int fin = sk.nextInt();

        Student s = new Student(name, mid, fin);

        s.displaySummary();

        sk.close();
    }
}
