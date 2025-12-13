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

/*
 * 
 * Here is a simple explanation and a complete Java program to demonstrate Exception Handling using Predefined Exceptions.

-> The Core Concept: "The Safety Net"
    In programming, errors (Exceptions) are like accidents. If you don't handle them, your program "crashes" (stops working completely).

-   Exception Handling is like having a safety net or a backup plan.

-> Predefined Exceptions: These are errors Java already knows about, like "Division by Zero" (ArithmeticException) or "Array Index Out of Bounds" (ArrayIndexOutOfBoundsException).

**The Real-World Example: "The Car and the Spare Tire"**
Imagine you are driving a car (Running a Program):

1.Try (Driving): You drive on the road. This is the risky part where a puncture might happen.

2.Catch (Spare Tire): If a tire bursts (Exception), you don't abandon the car. You change the tire using the catch block and continue your journey.

3.Finally (Parking): Whether you had a flat tire or not, you eventually park the car and turn off the engine.
 */