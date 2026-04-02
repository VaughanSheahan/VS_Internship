package searching;
import java.util.Scanner;
import VS_Functions.*;
//VS_Function is the self-made package containing the arrayTools class
import sorting.insertionSort;
//sorting is a self-made package of sorting algorithms

public class binarySearch{

  public static int search(int[] searchingArray, int key, int low, int high){
    //Recursive binary search algorithm

    Double temp =  Math.floor( (high + low)/2 );
    int mid = temp.intValue();

    if(searchingArray[mid] == key){
      return mid;
    }

    if(high - low == 0){
      return -1;
    }

    if(key < searchingArray[mid]){
      return search(searchingArray, key, low, mid-1);
    }

    //no if statement is needed here as we know where to keep searching
      return search(searchingArray, key, mid+1 , high);

  }

  //-------------------------------------------

  public static void main(String[] args) {
    
    /*we need to parse the array as an integer array, 
    then ensure it is sorted to use binary search*/
    int[] searchingArray = arrayTools.parseArray(args);
    insertionSort.forCode(searchingArray);

    //take
    Scanner input = new Scanner(System.in);
    System.out.println("What are you searching for?");
    int key = input.nextInt();

    int index = search(searchingArray, key, 0, searchingArray.length-1);

    if(index == -1){
      System.out.println("key '" + key + "' not present in array");
      return;
    }
    System.out.println("key '" + key + "' found at index: "+ index);

  }

}