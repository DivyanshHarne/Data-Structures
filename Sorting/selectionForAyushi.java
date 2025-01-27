package Sorting;

import java.util.Arrays;

public class selectionForAyushi {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,4};
        int[] descArray = {90,75,65,43,42,39,37,33,24,12,11,10,2,-4,-15,-30};
        System.out.println(Arrays.toString(SelectAyushi(arr)));
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = 0; i < end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }return max;
    }
    static int[] SelectAyushi(int[] arr){
        for(int i =0; i < arr.length; i++){
            int last = arr.length - 1 - i;

            int maximum = getMaxIndex(arr, 0, last);

            int temp = arr[last];
            arr[last] = arr[maximum];
            arr[maximum] = temp;
            // last--;
        }
        return arr;


    }
    
}
