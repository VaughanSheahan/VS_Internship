package searching;
import VS_Functions.*;
//VS_Function is the self-made package containing the arrayTools class
import sorting;
//sorting is a self-made package of sorting algorithms

public class binarySearch{

  public static void main(String[] args) {
    
    //method to convert a string array from the terminal into an integer array
    int[] sortingArray = arrayTools.parseArray(args);
    sorting.insertionSort(sortingArray);

    

  }

}