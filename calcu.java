import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Get user input for the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Perform arithmetic operations
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        // Close the scanner
        scanner.close();
    }
}