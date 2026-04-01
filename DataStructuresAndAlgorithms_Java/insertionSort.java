package sorting;
import VS_Functions.*;
public class insertionSort{

  public static void main(String[] args) {

    //takes string array from commandline and parses it to an integer array
    int[] sortingArray = arrayTools.parseArray(args);
      arrayTools.printArray(sortingArray);
        System.out.println("");
    if(sortingArray.length > 1){
    
    //first loop iterates each position of the unsorted array
    for(int i=1 ; i < sortingArray.length; i++){
        int sortingValue = sortingArray[i];
        int j = i-1;

        /*loops back to find the greatest element that is not
        greater than the sorting value, shifting the array right as it goes*/
        while(j>=0 && sortingArray[j] > sortingValue){
            sortingArray[j+1] = sortingArray[j];
            j--;
        }

        //once the correct position is found, place the value there
        sortingArray[j+1] = sortingValue;
    }

  }

    arrayTools.printArray(sortingArray);

  }

}