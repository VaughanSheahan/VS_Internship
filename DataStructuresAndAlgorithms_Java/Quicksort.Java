package sorting;
import sorting.insertionSort;
import VS_Functions.*;

public class quickSort{

    public static void quicksort(int[] Arr, int low, int high){
        //recursive quicksort method

        if(high-low <= 0){
            return;
        }

        int mid = (int) Math.floor( (high+low)/2 );
        int pivot = Arr[mid];
        Arr[mid] = Arr[high];
        Arr[high] = pivot;
        //finds a pivot, then extracts it and fills its index

        int i = low-1;
        int j = high;

        while(true){
            //this loop sorts the subarray into its partitions

            while(Arr[++i] < pivot);
            while(j > 0 && Arr[--j] > pivot);
            //finds the first values out of place from the right and left

            if(i >= j){
                break;
            }
            //if the partitions are sorted, stop the loop

            int temp = Arr[j];
            Arr[j] = Arr[i];
            Arr[i] = temp;
            //if not, swaps the two values
        }

        Arr[high] = Arr[i];
        Arr[i] = pivot;
        //places the pivot between the partitions

        quicksort(Arr, low, i-1);
        quicksort(Arr, i+1, high);

    }

    public static void main(String[] args){

        int[] sortingArr = arrayTools.parseArray(args); 
        //converts string array from terminal into integer array

        quicksort(sortingArr, 0, sortingArr.length-1);

        arrayTools.printArray(sortingArr);

    }



} 