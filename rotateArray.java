import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr= {12,23,45,95,65,11,22,33,};
        System.out.println(Arrays.toString(arr));
        rotate(arr, 0);
        System.out.println(Arrays.toString(arr));

    }

  

    static void rotate(int[] arr, int k){
        // int[] finalArray= new int[arr.length];
        for(int i =0; i<arr.length; i++){
            if(i==0){
                arr[arr.length-1] = arr[i];
                arr[i]= arr[i+1];
            }
            
            else if(i==arr.length-1){
                arr[i] = arr[0];
            }
            else{
                
                
                arr[i]= arr[i+1];
            }



        }


        
    }
}
