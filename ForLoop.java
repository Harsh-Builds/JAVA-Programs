
// Declare loop controll variable inside the for
// And compute factorial and sum of numbers.

class ForLoop {
    
    public static void main(String[] args){

        int sum = 0;
        int factorial = 1;

        for(int i = 1; i <=5; i++){   // initialized variable inside loop. But the scope of this variable i within this loop.

            sum += i;
            factorial *= i;

        }

        System.out.println("sum of all numbers 1 to 5 is : "+ sum);
        System.out.println("Factorial of 5 is : "+ factorial);

    }
}
