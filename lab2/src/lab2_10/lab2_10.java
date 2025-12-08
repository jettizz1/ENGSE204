package lab2_10;
import java.util.Scanner;
class Productonezero {
    String name;
    double price;
    Productonezero(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class ShoppingCarttt {
    Productonezero[] items;
    int itemCount;
    ShoppingCarttt() {
        items = new Productonezero[10];  
        itemCount = 0;      
    }
    void AddProducttt(Productonezero p) {
        if (itemCount < 10) {  
            items[itemCount] = p;
            itemCount++;
        }
    }
    double CalculateTotalPriceee() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].price;
        }
        return total;
    }
}
public class lab2_10 {
    public static void main(String[] args) {
        Scanner Scanneroneuser = new Scanner(System.in);
        int N = Scanneroneuser.nextInt();
        Scanneroneuser.nextLine();  
        ShoppingCarttt cart = new ShoppingCarttt();
        for (int i = 0; i < N; i++) {
            String name = Scanneroneuser.nextLine();
            double price = Scanneroneuser.nextDouble();
            Scanneroneuser.nextLine(); 
            Productonezero product = new Productonezero(name, price);
            cart.AddProducttt(product);
        }
        double totalPrice = cart.CalculateTotalPriceee();
        System.out.println(totalPrice);
        Scanneroneuser.close();
    }
}