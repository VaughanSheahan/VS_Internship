package searching;
import java.util.Scanner;

public class linearSearch{

    public static void main(String[] searchingArray){

        Scanner input = new Scanner(System.in);
        System.out.println("what are you searching for?");
        String key = input.nextLine();

        boolean found = false;
        for(int i=0; i<searchingArray.length; i++){

            if(key.equals(searchingArray[i])){
                System.out.println("instance of key '" + key + "' found at index " + i);
                found = true;
            }

        }

        if (found == false){
            System.out.println("key '" + key + "' not present in array");
        }

    }

}