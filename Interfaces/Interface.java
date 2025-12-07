package Interfaces;


// 1. Define the Parent Interface
interface Phone {
    void makeCall();
}

// 2. Define the Child Interface that EXTENDS the Parent Interface
// 'extends' is used here because both are interfaces.
interface SmartPhone extends Phone {
    void browseInternet();
}

// 3. Define a Class that IMPLEMENTS the Child Interface
// 'implements' is used because a Class is using an Interface.
class IPhone implements SmartPhone {
    
    // We must define the method from the Parent Interface (Phone)
    public void makeCall() {
        System.out.println("Calling a number...");
    }

    // We must ALSO define the method from the Child Interface (SmartPhone)
    public void browseInternet() {
        System.out.println("Browsing the web on 5G...");
    }
}

// Main class to run the program
public class Interface {
    public static void main(String[] args) {
        // Create an object of the class
        IPhone myPhone = new IPhone();

        System.out.println("--- Demo of extends and implements ---");
        
        // Call methods from both interfaces
        myPhone.makeCall();        // From Phone interface
        myPhone.browseInternet();  // From SmartPhone interface
    }
}


/*
 * 
 * 
 * In Java, the rule is: A class can have only one father (Parent Class), but it can have many roles (Interfaces).

Here is the clear breakdown of the difference:

1. Classes (extends): The "One Parent" Rule
You are right. Java does not support "Multiple Inheritance" with classes.

Valid: class Child extends Father

Invalid: class Child extends Father, Mother (This will give an error).

Why? If both Father and Mother have a method called cook(), and the Child calls cook(), Java gets confused about which one to run (this is called the "Diamond Problem").

2. Interfaces (implements): The "Multiple Roles" Rule
However, a class can implement multiple interfaces. This is how Java achieves multiple inheritance safely.

Valid: class Child implements Student, Player, Singer

Why is this allowed? Because interfaces (usually) only have empty methods (no body). The interfaces just say "You must have a play() method," but they don't provide the code. The class provides the code, so there is no confusion or conflict.

Code Example: Multiple Interface Implementation
Let's look at a phone that is both a Camera and a MusicPlayer.

Java

// Interface 1
interface Camera {
    void takePhoto();
}

// Interface 2
interface MusicPlayer {
    void playSong();
}

// A Class implementing MULTIPLE interfaces (separated by comma)
class SmartPhone implements Camera, MusicPlayer {
    
    // Logic for Camera
    public void takePhoto() {
        System.out.println("Click! Photo taken.");
    }

    // Logic for MusicPlayer
    public void playSong() {
        System.out.println("Playing music: Tum Hi Ho...");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        
        // It can do both things!
        myPhone.takePhoto();
        myPhone.playSong();
    }
}

Summary:
    Type                Keyword              Limit                   SyntaxExample
Class to Class          extends             Only 1                 class A extends B   
Class to Interface      implements          Multiple               class A implements B, C, D
Interface to Interface  extends             Multiple                interface A extends B, C
 */