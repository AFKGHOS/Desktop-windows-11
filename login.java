import java.util.Scanner;

 public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("====Fomrular de logare====");

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (validateUsername(username) && validatePassword(password)) {
            System.out.println(" Contul Dvs. a fost conectat cu succes!");
             } else {
            System.out.println("Contul Dvs. nu a fost gasit"); 
        }
    
        }
     
   public static boolean validateUsername(String username) {
    return username.length() >= 5;
   }
   public static boolean validatePassword(String password) {
    return password.length() >= 8;
   }

    }
