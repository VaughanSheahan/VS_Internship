package VS_Functions;

public class arrayTools{
  //a few methods I use to make arrays easier to deal with

  public static int[] parseArray(String[] args) {
    //a method to parse an array of strings into an array of integers
    int[] Arr = new int[args.length];

    for(int i=0; i<Arr.length; i++){
        Arr[i] = Integer.parseInt(args[i]);
    }

    return Arr;
  }

//-------------------------------------------

  public static void printArray(int[] Arr) {
    //a method that prints an array to the terminal

    System.out.print(Arr[0]);
    for(int i=1; i<Arr.length; i++){
      System.out.print(","+Arr[i]);
    }

    System.out.println("");

  }

  //------------------------------------------------------

  public static int maxArray(int[] Arr){

    int max = 0;

    for(int i = 0; i < Arr.length; i++){

      if( max < Arr[i]) max = Arr[i];

    }

    return max;

  }

}