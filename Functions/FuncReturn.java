package Functions;

// this function program will return addition of 2 numbers.
public class FuncReturn {
    
    static int add(int a , int b){
        return a + b ;
    }

    public static void main(String[] args) {
        int sum = add(20, 40);
        System.out.println("sum of a and b is : "+ sum);
    }
}
