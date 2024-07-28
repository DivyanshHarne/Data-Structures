import java.util.Arrays;

public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,33,4,5,6};
        // System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
       
    }

    static void reverse(int[] arr){
        int start= 0;
        int end = arr.length - 1;

        while(start<end){
        swap(arr, start, end);
        start++;
        end--;
        }
    }


   static int max(int[] arr){
            int hi = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>hi){
                    hi = arr[i];
                }
            }
            return hi;
        }
    static void swap( int[] arr, int index1, int index2){
        int temp= arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
    }
}
