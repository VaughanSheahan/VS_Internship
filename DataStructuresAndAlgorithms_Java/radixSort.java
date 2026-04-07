package sorting;
import VS_Functions.*;

public class radixSort{

    public static void main(String[] args){

        int[] sortingArr = arrayTools.parseArray(args);
        int[] temp = new int[sortingArr.length];

        for(int i = 1; i <= arrayTools.maxArray(sortingArr); i *= 10){

            int[] places = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            for (int j = 0; j < sortingArr.length; j++){
                places[(sortingArr[j] / i) % 10]++;
            }
            
            for (int j = 1; j < 10; j++){
                places[j] += places[j - 1];
            }
           
            for (int j = sortingArr.length - 1; j >= 0; j--) {
                temp[places[(sortingArr[j] / i) % 10] - 1] = sortingArr[j];
                places[(sortingArr[j] / i) % 10]--;
            }

            for(int j = 0; j < sortingArr.length; j++){
                sortingArr[j] = temp[j];
            }

        }

        arrayTools.printArray(sortingArr);

    }

}