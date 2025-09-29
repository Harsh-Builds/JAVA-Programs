 import java.util.Scanner;
 
 class Guess {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char ch; 
        char answer = 'h';
        char answer2 = 'H';

        System.out.println("I am thinking of a letter between A to Z .");
        System.out.print("Can you guess it :  ");

        ch = sc.next().charAt(0);

        if (ch == answer || ch == answer2) 
            
                    System.out.println("Right");
       else System.out.println("wrong");

        

        sc.close();
    }
   
}
