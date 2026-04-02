package VS_Functions;

public class arrayTools{
  //a few methods I use to make arrays easier to deal with

  public static int[] parseArray(String[] args) {
    //a method to parse an array of strings into an array of integers
    int[] parsedArray = new int[args.length];

    for(int i=0; i<parsedArray.length; i++){
        parsedArray[i] = Integer.parseInt(args[i]);
    }

    return parsedArray;
  }

//-------------------------------------------

  public static void printArray(int[] toPrint) {
    //a method that prints an array to the terminal

    System.out.print(toPrint[0]);
    for(int i=1; i<toPrint.length; i++){
      System.out.print(","+toPrint[i]);
    }

    System.out.println("");

  }

}