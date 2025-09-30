 class FinalKey {
    
    // use the final keyword
public static void main(String[] args){

      int num1 = 10;
    final int num2 = 50;        // now its bahave like constant variable that value we can not change.

    num1 = 20;
    System.out.println(num1);

    // num2 = 60;    // if we overwrite it , it throws an error . 
    System.out.println(num2);

}
  
}
