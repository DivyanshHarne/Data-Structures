import java.util.Arrays;

public class search2DArray {
    public static void main(String[] args) {
        int[][] mattrix = {
            {1,54,5,97},
            {45,26},
            {12,45,651,97,12,33},
            {12,45,02,320}
        };
        int target = 2;
        int[] ans = search(mattrix, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(mattrix));
    }

    static int[] search(int[][] arr, int target){
    
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(target == arr[i][j]) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
    
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
