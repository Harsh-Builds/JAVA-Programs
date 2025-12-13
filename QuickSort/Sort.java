
package QuickSort;

public class Sort {
   
    
    public static void main(String[] args) {
        
        int[] arr = {4,6,2,5,7,9,1,3};

        quick(arr, 0, arr.length - 1 );

        for (int e : arr) {
            
            System.out.print(e + " ");
        }

    }

     public static void quick(int[]arr, int low, int high){

        if(low < high){

        int pivotIndex = partition(arr, low, high);
        quick(arr, low, pivotIndex-1);
        quick(arr, pivotIndex+1, high);

        }
    }
   
    public static int partition(int[]arr , int low, int high){

        int pivot = arr[low];
        int i = low ;
        int j = high;

        while(i < j){

            while( i <= high && arr[i] <= pivot ){

                i++ ;
            }

            while (j >= low && arr[j] > pivot ) {
                j-- ;
            }

            if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            }
        } 

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

}
