package lab2_9;
import java.util.Scanner;
class Address {
    String street;
    String city;
    String zipCode;
    Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    String GetFullAddressten() {
        return street + ", " + city + ", " + zipCode;
    }
}
class Studentten {
    String name;
    Address address;
    Studentten(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    void DisplayProfilexxvi() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.GetFullAddressten());
    }
}
public class lab2_9 {
    public static void main(String[] args) {
        Scanner Scannertenxi = new Scanner(System.in);
        String name = Scannertenxi.nextLine();
        String street = Scannertenxi.nextLine();
        String city = Scannertenxi.nextLine();
        String zipCode = Scannertenxi.nextLine();
        Address address = new Address(street, city, zipCode);
        Studentten studentuser = new Studentten(name, address);
        studentuser.DisplayProfilexxvi();
        
        Scannertenxi.close();
    }
}