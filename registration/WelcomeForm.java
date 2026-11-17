package registration;

//Import Scanner to get input from the user
import java.util.Scanner;

public class WelcomeForm {
    public static void main(String[] args) {
		
		 // Create Scanner object to read user input
		 Scanner input = new Scanner(System.in);
		 
		 // Ask the user to enter their first name
		 System.out.print("Enter your first name: ");
	     String firstName = input.nextLine();
	     
	     // Ask the user to enter their age
	     System.out.print("Enter your age: ");
	     int age = input.nextInt();
	     
	     // Display welcome message with user details
	     System.out.println("\n----- REGISTRATION SUCCESSFUL -----");
	     System.out.println("Welcome, " + firstName + "!");
	     System.out.println("Your age is: " + age);

	     // Close the Scanner
	     input.close();
	}
}
