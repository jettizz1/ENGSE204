package lab3_3;
class Userthrre {
    private String password;
    public Userthrre(String initialPassword) {        
        this.password = initialPassword;
    }  
    public String getPassworddd() {
        return password;
    }
    public void SetPassworddd(String newPassword) {
        boolean isLengthValid = newPassword.length() >= 8;
        boolean isLongerThanCurrent = newPassword.length() > this.password.length();
        if (isLengthValid && isLongerThanCurrent) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } 
        else {           
            if (newPassword.length() < 8) {
                System.out.println("Password is too short.");
            } 
            else if (newPassword.length() <= this.password.length()) { 
                System.out.println("password updated .");
            }
        }
    }
}
public class lab3_3 {
    public static void main(String[] args) {
        java.util.Scanner scannerrox = new java.util.Scanner(System.in);
        String initialPassworddd = scannerrox.nextLine();
        String NewPassworddd = scannerrox.nextLine();    
        Userthrre UserName = new Userthrre(initialPassworddd);
        UserName.SetPassworddd(NewPassworddd);
        System.out.println(UserName.getPassworddd());
        scannerrox.close();
    }
}