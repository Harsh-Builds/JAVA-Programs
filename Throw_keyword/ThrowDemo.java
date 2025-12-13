package Throw_keyword;

public class ThrowDemo {
    
    // This method checks the age
    static void checkAge(int age) { 
        if (age < 18) {
            // THE THROW KEYWORD
            // We are manually creating an error object and "throwing" it
            throw new ArithmeticException("Access Denied - You must be at least 18 years old."); 
        }
        else {
            System.out.println("Access Granted - You are old enough to vote!"); 
        }
    } 

    public static void main(String[] args) { 
        System.out.println("--- Voting Check System ---");
        
        try {
            // Let's try to pass an invalid age (15)
            checkAge(15); 
        } 
        catch (ArithmeticException e) {
            // This catches the error we manually threw above
            System.out.println("EXCEPTION CAUGHT: " + e.getMessage());
        }
        
        System.out.println("--- Program Finished ---");
    }
}
