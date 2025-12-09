package lab2_5;
import java.util.Scanner;
class Rectangle {

    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class lab2_5 {
    public static void main(String[] args) {

        Scanner inputuser = new Scanner(System.in);

        double width = inputuser.nextDouble();
        double height = inputuser.nextDouble();

        Rectangle boxxxi = new Rectangle(width, height);

        System.out.println(boxxxi.getArea());
        System.out.println(boxxxi.getPerimeter());

        inputuser.close();
    }
}
