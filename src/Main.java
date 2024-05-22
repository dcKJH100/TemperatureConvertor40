/**
 * Demo the input using Scanner class
 * @author Textbook
 * @version 1.0
 */
import java.util.*;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        String userContinue = "y";

        // Loop until user wants out
        while (userContinue.equalsIgnoreCase("y")) {
            System.out.print("Enter Fahrenheit temperature: ");
            fahrenheit = input.nextDouble();
            input.nextLine();   // clear the input buffer
            celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(Double.toString(fahrenheit) +
                    "° Fahrenheit is " + Double.toString(celsius) +
                    "° Celsius");
            // Do we continue?
            System.out.print("Continue (Y/n)? ");
            userContinue = input.nextLine();
            if (userContinue.isEmpty()) {
                userContinue = "Y";
            }
        }
    }
}
