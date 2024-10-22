package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,4,-1,400};
        int[] descArray = {90,75,65,43,42,39,37,33,24,12,11,10,2,-4,-15,-30};
        System.out.println(Arrays.toString(bubble(descArray)));
    }
    static int[] bubble(int[] arr){
        int l = arr.length;
        boolean swapped; // optimization
        for(int i = 0; i < l; i++){
            swapped = false;
            for(int j = 1; j < l-i; j++){
                if(arr[j-1] > arr[j]){
                    //THIRD VARIBLE APPROACH
                    // int temp = arr[j-1];
                    // arr[j-1] = arr[j];
                    // arr[j] = temp;

                    //TWO VARIABLE APPROACH
                    arr[j-1] = arr[j-1] + arr[j];
                    arr[j] =  arr[j-1] - arr[j];
                    arr[j-1] =  arr[j-1] - arr[j];
                    swapped = true;
                }
            }
            if(!swapped) break; //optimiztion
        }return arr;
    }
}
