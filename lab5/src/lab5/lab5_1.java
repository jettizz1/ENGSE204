package lab5;
import java.util.Scanner;
class Animall {
 protected String name;
 protected int age;
 public void displayInfo() {
     System.out.println("Name: " + name + ", Age: " + age);
 }
}

class Dog extends Animall {
 public void makeSound() {
     System.out.println("Woof! Woof!");
 }
}


public class lab5_1 {
 public static void main(String[] args) {
     Scanner Scannerri = new Scanner(System.in);

     System.out.print("Enter name: ");
     String name = Scannerri.nextLine();

     System.out.print("Enter age: ");
     int age = Scannerri.nextInt();

     Dog doggi = new Dog();

     doggi.name = name;
     doggi.age = age;
  
     doggi.makeSound();
     doggi.displayInfo();
     
     Scannerri.close();
 }
}