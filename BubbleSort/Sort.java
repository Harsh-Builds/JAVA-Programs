

package BubbleSort;

class Sort {

    public static void allarr(int arr[]){

        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[]args){

        // Bubble sort 
        int[] myarr = {8,3,1,2,9,7} ;
        int n = myarr.length ;

        for(int i=0 ; i < n-1; i++){

            for(int j = 0; j< n-1-i; j++){

                if(myarr[j] > myarr[j+1]){
                    int temp = myarr[j+1];
                    myarr[j+1] = myarr[j];
                    myarr[j] = temp;
                }

            }
        }

        allarr(myarr);
    


    }
}
