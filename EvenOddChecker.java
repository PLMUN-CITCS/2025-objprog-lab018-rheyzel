import java.util.Scanner;

public class EvenOddChecker {

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        // Check if the input is a valid integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Discard the invalid input
            System.out.print("Enter an integer: ");
        }
        
        // Return the valid integer input
        return scanner.nextInt();
    }

    // Method to check whether a number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    public static void main(String[] args) {
        // Get the integer input from the user
        int number = getIntegerInput();
        
        // Get the result of checking even or odd
        String result = checkEvenOrOdd(number);
        
        // Display the result
        System.out.println(result);
    }
}
