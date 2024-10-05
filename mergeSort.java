import java.util.Arrays;

public class mergeSort {
    static void rotateOnce(int arr[]){
        int temp = arr[arr.length-1];

        for(int i = arr.length-1; i > 0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public static void main(String[] args) {
        int[] ascArray = {-2,-6,-8,9,10,45,49,64,78,-89,110,116};
        // int[] arr = mergeSort(ascArray);
        System.out.println(Arrays.toString(ascArray));
        rotateOnce(ascArray);
        System.out.println(Arrays.toString(ascArray));

        // printArray(arr);
    }
    static int[] mergeSort (int[] arr){
        // 3conditions 
        // 1 -> arr.len == 1
        if(arr.length == 1) return arr;
        // 2 -> mid = s +  e /2;
        int mid = arr.length /2;
        // 3 -> left Copy(s, m);
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        // 4 -> Right Copy(m, e);
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        // 5 -> return arr joki sorted and merged!
        return merge(left, right);

    }
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static  int[] merge(int[] first, int [] second){
        int[] mix = new int[first.length + second.length];
        int i= 0, j= 0, k=0;
        while (i < first.length && j < second.length) {
            if(first[i]< second[j]){
                mix[k] = first[i];
                i++;
                k++;
            }else{
                mix[k] = second[j];
                j++;
                k++;
            }
            
        }
        for (int y = i; y < first.length;y++){
            mix[k] = first[y];
            k++;
        }
        for (int z = j; z < second.length;z++){
            mix[k] = second[z];
            k++;
        }
        // while (i < first.length){   
        //     mix[k] = first[i];
        //     i++;
        //     k++;
        //  }

        // while (j < second.length){
        //     mix[k] = second[j];
        //     j++;
        //     k++;
        // }
        return mix;
    }
}