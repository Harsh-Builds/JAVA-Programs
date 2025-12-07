 class TheArr {

    public static void main(String[] args){

        // int[] marks = {12, 34, 76, 32};

        // marks[1] = 60;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.print(marks);

        int[] num = new int[5];

        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[4] = 50;
      

    //   for(int i = 0; i < num.length; i++){       //loop through each elements of array by just a normal for loop 

    //     System.out.println(num[i]);
    //   }

    for(int numbers : num){        //loop through each elements of array by for-each loop
        
        System.out.println(numbers);     
    }

    System.out.println("");


    // program to find the lowest number in an array
    int[] data = {12, 45, 11, 56, 10, 7, 95, 9, 45};

    // int arrLength = data.length;

    int small = data[0];

    for(int smallestNum : data){

        if(smallestNum < small){
            small = smallestNum;
        }
    }
    System.out.println("The smallest number is : "+ small);

      System.out.println("");


    // Lets create a multidimensional array:-
    // int[][] items = new int[3][4];   // So, we create an empty array of 3 raws and 4 columns.
    int[][] items = {{1,2,3,4}, {2,4,6,8}, {3,6,9,12}};  // same as above .

    //  System.out.println(items[2][1]) ;

    int itmLgth = items.length;
    System.out.println(itmLgth);
    
    for(int i = 0; i < itmLgth; i++){                   // we can also do this by for each loop.
        for(int j = 0; j < items[i].length ; j++){
            System.out.print(items[i][j] + " ");
        }
         System.out.println();
    }

    


    }

    
}


