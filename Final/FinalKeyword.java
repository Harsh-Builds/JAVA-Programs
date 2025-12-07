package Final;


// 1. FINAL CLASS: This class cannot be extended (No inheritance allowed)
final class SecretCode {
    void showSecret() {
        System.out.println("The secret is 1234");
    }
}

// class Hacker extends SecretCode { } // <--- ERROR! Cannot extend a final class.

class Parent {
    // 2. FINAL VARIABLE: Value cannot be changed once assigned
    final int MAX_MARKS = 100; 
    
    // 3. FINAL METHOD: This method cannot be overridden by Child class
    final void universalRule() {
        System.out.println("Sun rises in the East.");
    }
    
    void normalMethod() {
        System.out.println("I am a normal method.");
    }
}

class Child extends Parent {
    
    // void universalRule() { ... } // <--- ERROR! Cannot override a final method.
    
    // We CAN override normal methods
    @Override
    void normalMethod() {
        System.out.println("I am a modified normal method.");
    }
    
    void tryToChangeVariable() {
        // MAX_MARKS = 200; // <--- ERROR! Cannot change a final variable.
        System.out.println("Max marks are: " + MAX_MARKS);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        System.out.println("--- Final Keyword Demo ---");
        
        Child c = new Child();
        c.universalRule();       // Calls the final method from Parent
        c.tryToChangeVariable(); // Prints the final variable
        c.normalMethod();        // Calls the overridden method
    }
}
