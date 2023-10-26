import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'n' to generate the Fibonacci sequence: ");
        
        // Read the value of 'n' from the user
        int n = scanner.nextInt();
        
        // Check if 'n' is less than 1
        if (n < 1) {
            System.out.println("Invalid input. 'n' must be a positive integer.");
        } else {
            // Display the Fibonacci sequence up to the 'n'-th term
            System.out.println("Fibonacci Sequence up to the " + n + "-th term:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        
        scanner.close();
    }

    // Recursive function to calculate the Fibonacci number at a given position
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
