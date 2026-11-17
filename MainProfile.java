// Import classes from user-defined packages
import profile.UserInput;
import greeting.GreetingDisplay;

public class MainProfile {

    public static void main(String[] args) {

        // Create an object of UserInput class
        UserInput user = new UserInput();

        // Get the user's name
        String name = user.getUserName();

        // Create an object of GreetingDisplay class
        GreetingDisplay greeting = new GreetingDisplay();

        // Display the greeting
        greeting.displayGreeting(name);
    }
}
