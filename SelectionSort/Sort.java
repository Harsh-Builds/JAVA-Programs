package SelectionSort;

public class Sort {
    
    // selection sort
    public static void main(String[]args){
    int[] myarr = {9,6,7,3,1,2};
   
    for(int i = 0; i< myarr.length; i++){

        int smallest = i;

        for(int j= i+1; j < myarr.length; j++){

            if(myarr[j] < myarr[smallest]){

                int temp = myarr[j];
               
                myarr[j] =  myarr[smallest];

                 myarr[smallest] = temp;

            }
        }
    }

    for(int k= 0; k < myarr.length; k++){

        System.out.print(myarr[k] + " ");
    }
}

}