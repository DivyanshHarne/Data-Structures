package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,4};
        int[] descArray = {90,75,65,43,42,39,37,33,24,12,11,10,2,-4,-15,-30};
        System.out.println(Arrays.toString(selection(descArray)));
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = 0; i < end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }return max;
    }
    static int[] selection(int[] arr){
        //here we select max/min element of the array, putting it in correct place
        int l= arr.length;
        for(int i = 0; i < l; i++){
            int last  = l-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);

            // int max= 0;
            // int maxIndex= 0;
            // swapped = false;
            // for(int j = 0; j < l-i; j++){
            //     if(arr[j]> max){
            //         max = arr[j];
            //         maxIndex = j;
            //     }
            // }
            // //SWAP
            arr[last] = arr[last] + arr[maxIndex];
            arr[maxIndex] = arr[last] - arr[maxIndex];
            arr[last] = arr[last] - arr[maxIndex];
        }
        return arr;

    }
}
