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

        System.out.print("Enter Fahrenheit temperature: ");
        fahrenheit = input.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(Double.toString(fahrenheit) +
                "° Fahrenheit is " + Double.toString(celsius) +
                "° Celsius");
    }
}
