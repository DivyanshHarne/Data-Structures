public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] ascArray = {2,6,8,9,10,45,49,64,78,89,110,116};
        int[] descArray = {90,75,65,43,42,39,37,33,24,12,11,10,2,-4,-15,-30};
        int target = 12;
        int a = ceiling(ascArray, target);
        System.out.println(a);
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = (start + end)/2;

            if (target < arr[mid]) {
                end = mid -1;
            }else if (target > arr[mid]) {
                start = mid +1;
            }else{
                return mid +1;
            }
        }return start;
    }
}
