package lab3;
import java.util.Scanner;
class InventoryItemmm {
    private String productName;
    private int stock;
    public InventoryItemmm(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
        	this.stock = 0;
        }
    }
    
    public String GetProductName() {
        return productName;
    }
    
    public int GetStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > this.stock) {
            System.out.println("Not enough stock.");
        } else {
            this.stock -= amount;
            System.out.println("Sale successful.");
        }
    }
}

public class lab3_8 {
    public static void main(String[] args) {
        Scanner Scannerrr = new Scanner(System.in);
        String inputProductname = Scannerrr.nextLine();
        
        int inputInitialstock = Scannerrr.nextInt();
        InventoryItemmm itemmmbox = new InventoryItemmm(inputProductname, inputInitialstock);
        
        int N = Scannerrr.nextInt();
        
        String[] commandList = new String[N];
        int[] amountList = new int[N];
        for (int i = 0; i < N; i++) {
            commandList[i] = Scannerrr.next();
            amountList[i] = Scannerrr.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            if (commandList[i].equalsIgnoreCase("ADD")) {
                itemmmbox.addStock(amountList[i]);
            } else if (commandList[i].equalsIgnoreCase("SELL")) {
                itemmmbox.sellStock(amountList[i]);
            }
        }
        
        System.out.println("Final Stock: " + itemmmbox.GetStock());
        Scannerrr.close();
    }
}
