package lab3_1;
import java.util.Scanner;
class User {
    private String username;
    public User(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
}
public class lab3_1{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();
        User user = new User(input);
        System.out.println(user.getUsername());
        scanner.close();
    }
 
}