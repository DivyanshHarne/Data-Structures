import java.util.Arrays;

class Test {
    public static void main(String args[])
    {
        int intArray[] = { 1, 2, 3,4,5 };
        // System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(reverse(intArray, 0, 4)));
        // System.out.println(Arrays.toString(intArray));
    }

    static int[] reverse(int arr[], int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // swap(arr[start], arr[end]);
            start++;
            end--;
        }
        return arr;
    }

    static void swap(int a, int b){
        System.out.println(a + "  " + b);
        int temp = a;
        a =b;
        b = temp;
        System.out.println(a + "  " + b);
    }
}