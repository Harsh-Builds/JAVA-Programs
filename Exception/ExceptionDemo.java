package Exception;

import java.util.Scanner;


public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Start of Program ---");

        // 1. TRY BLOCK: Put "risky" code here
        try {
            System.out.print("Enter a number to divide 100 by: ");
            int divisor = sc.nextInt();
            
            // If user enters 0, this line throws an ArithmeticException
            int result = 100 / divisor; 
            
            System.out.println("Result: " + result);
        }
        
        // 2. CATCH BLOCK: This runs ONLY if an error occurs
        catch (ArithmeticException e) {
            System.out.println("ERROR CAUGHT: You cannot divide by Zero!");
            // e.printStackTrace(); // Optional: Prints technical details
        }
        catch (Exception e) {
             // It's good practice to have a generic catch for other unknown errors
             System.out.println("Some other error occurred.");
        }

        // 3. FINALLY BLOCK: This runs ALWAYS (Error or No Error)
        finally {
            System.out.println("Execution Completed (Inside Finally Block).");
            sc.close(); // Good place to close scanners/files
        }

        System.out.println("--- End of Program (Program didn't crash!) ---");
    }
}

