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
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;
        double modulo = firstNumber % secondNumber;


        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulo: " + modulo);

        // Close the scanner
        scanner.close();
    }
}