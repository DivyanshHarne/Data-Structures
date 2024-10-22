import java.util.Arrays;
import java.util.Scanner;

public class inputTaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input of array
        // System.out.println("Enter length: ");
        // int len = sc.nextInt();
        // System.out.println("Enter array: ");
        // int num = 0;
        // int i =0;
        // int arr[] = new int[len];

        // while(i < len){
        //     arr[i] = sc.nextInt();
        //     i++;
        // }
        // System.out.println(Arrays.toString(arr));

        String s = sc.nextLine();
        String[] str = s.split(",");
        System.out.println(s);
    }
}
