import java.util.Arrays;
import java.util.Scanner;

public class arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ARRAY OF PRIMITIVES


        // Q: store 5 roll numbers
        // syntax:
        // datatype[] variable_name = new data-type[size];
        // int[] rollCall = new int[5];

        // // or directly

        // int[] rnos = {21,22,23,24,25};

        // // ***all elements in the array must be of same datatype
        // for (int num : rnos) {
        //     System.out.print(num + " "); // num here represenys each element of array
        // }


        // int[] ros; // declaration of array: here the ros is ting defined in stack. 
        // ros = new int[5]; // initialization: actually here the object is created in the memory(heap).

        // Declaration happens at compile time 
        // initialisation happpens at runtime


        // ARRAY OF NON-PRIMITIVE

        // String[] str = new String[5];
        // for (String ram : str) {
        //     System.out.println("Enter the value of string");
        //     ram = sc.nextLine();        
        // }
        // System.out.println("Enter the value of string");
        // for(int j=0; j<str.length; j++){
            
        //     str[j] = sc.next();
        // }
        // System.out.println(Arrays.toString( str));

        // Multi Dimension Array

        int [][] arr2d = new int[3][3];
        for(int m=0; m<arr2d.length; m++){
            for(int n=0; n<arr2d[m].length;n++){
                arr2d[m][n]= sc.nextInt();
            }
        }

        for(int m=0; m<arr2d.length; m++){
            for(int n=0; n<arr2d[m].length;n++){
                System.out.print(arr2d[m][n] + " ");
            }
            System.out.println();
        }
    }
} 