import java.util.Scanner;

public class ConvertCtoF {
    public static void main(String[] args) {
      
        // Create scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
      
        // Prompt the user to input a temperature in Celsius.
        System.out.println("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius input to Farenheit.
        double farenheit = (9.0 / 5 ) * celsius + 32;

        // Display the result.
        System.out.println(celsius + " Celsius is " + farenheit + " Farenheit. ");
      
        // Close the scanner.
        scanner.close();
    }
}
