package Sorting;
public class binarySearch {
    public static void main(String[] args){
        int[] ascArray = {2,6,8,9,10,45,49,64,78,89,110,116};
        int[] descArray = {90,75,65,43,42,39,37,33,24,12,11,10,2,-4,-15,-30};
        int target = 6;
        System.out.println(rec_BS(ascArray, target, 0, ascArray.length -1));
    }

    static int binSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start)/2; //just optimization
            // int mid = (start+end)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
            
        }return -1;
    }
    static int rec_BS(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }
        else if (arr[mid] < target) {
           return rec_BS(arr, target, mid+1, end);
        }else{
            return rec_BS(arr, target, start, mid-1);
        }
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];
        
        while (start <= end) {
            int mid = start + (end - start)/2; //just optimization

            if(target == arr[mid]){
                return mid;
            }
            if (isAsc) {
                if(target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            
            
        }return -1;
    }
}
