import java.util.Scanner;

public class logincheck {

     public static void main(String[] args) {

        // Default login credentials
        String defaultUsername = "admin";
        String defaultPassword = "java123";

        // Create Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter username
        System.out.print("Enter username: ");
        String username = input.nextLine();

        // Ask the user to enter password
        System.out.print("Enter password: ");
        String password = input.nextLine();

        // Check whether both credentials match
        if ((username==defaultUsername) && (password==defaultPassword)) {

            System.out.println("Login Successful");

        } else {

            System.out.println("Access Denied");

        }
        input.close();
    }
}


