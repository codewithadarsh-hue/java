
import java.util.Scanner;

public class LoginValidation {

    public static void main(String[] args) {

        // Create Scanner object to accept user input
        Scanner sc = new Scanner(System.in);

        // Get username code
        System.out.print("Enter username code: ");
        char username = sc.next().charAt(0);

        // Get password
        System.out.print("Enter password: ");
        int password = sc.nextInt();

        // Get role ID
        System.out.print("Enter role ID: ");
        int roleId = sc.nextInt();

        // Check Admin credentials
        if (username == 'A' && password == 1234 && roleId == 1) {

            System.out.println("Welcome Admin. Full access granted.");

        }

        // Check Student credentials
        else if (username == 'S' && password == 1111 && roleId == 2) {

            System.out.println("Welcome Student. Limited access granted.");

        }

        // Check Guest role
        else if (roleId == 3) {

            System.out.println("Welcome Guest. View-only access.");

        }

        // If none of the conditions match
        else {

            System.out.println("Invalid credentials or role.");

        }

        // Close Scanner
        sc.close();
    }
}
