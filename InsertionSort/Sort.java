
package InsertionSort;

public class Sort {
 
    public static void main(String[]args){

        int[] myarr = {3,7,8,2,5,9,3,1,10,7};

        for(int i = 1; i < myarr.length ; i++){  // unsorted array's index

             int current = i;  // undersorted array's current element that we compared with sorted element

            for(int j = i-1; j >= 0; j--){  // loop of the sorted array

               
                if(myarr[j] > myarr[current]){

                    int temp = myarr[j];
                    myarr[j] = myarr[current];
                    myarr[j +1 ] = temp;
                }

                current-- ;  // we need to decrese the current ith index to update the position of our compared value.
            }

        }

        for(int k =0; k < myarr.length; k++){

            System.out.print(myarr[k] + " ");
        }
    }
}
