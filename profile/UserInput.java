package profile;

// Import Scanner to get input from the user
import java.util.Scanner;

public class UserInput {

    // Method to collect the user's name
    public String getUserName() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Close the Scanner
	    input.close();

        return name;        
    }
}
