package sorting;
import VS_Functions.*;
//VS_Function is the self-made package containing the arrayTools class

public class bubbleSort{

  public static void main(String[] args) {
    
    //method to convert a string array from the terminal into an integer array
    int[] sortingArray = arrayTools.parseArray(args);

    /*the variable 'i' tracks the number of passes made over the array.
    'i' is used to know when the next loop has already hit the sorted section of the array*/
    for(int i=sortingArray.length; 0<=i; i--){
        //the second loop checks if each pair of values are in correct order, swapping as needed
        for(int j=1; j<i; j++){
            if(sortingArray[j-1] > sortingArray[j]){
                int temp = sortingArray[j-1];
                sortingArray[j-1] = sortingArray[j];
                sortingArray[j] = temp;
            }
        }

    }

    //method to print an array to the terminal
    arrayTools.printArray(sortingArray);

  }

}