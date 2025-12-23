package lab5;
import java.util.Scanner;
class Animal {
 protected String name;
 protected int age;
 public void displayInfo() {
     System.out.println("Name: " + name + ", Age: " + age);
 }

 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

class Cat extends Animal {
	@Override
 public void makeSound() {
     System.out.println("Meow!");
 }
}

public class lab5_2 {
 public static void main(String[] args) {

     Scanner Scannerti = new Scanner(System.in);

     System.out.print("Enter name: ");
     String name = Scannerti.nextLine();

     System.out.print("Enter age: ");
     int age = Scannerti.nextInt();


     Cat cat = new Cat();

     cat.name = name;
     cat.age = age;
   
     cat.displayInfo();
     cat.makeSound();
     
     Scannerti.close();
 	}
}
