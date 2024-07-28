import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);

        // ArrayList<Integer> list = new ArrayList<>(3);
        // list.add(2);    
        // list.add(5);
        // list.add(77);
        // list.add(123);
        // list.add(45);
        // for(int i=0; i< 5; i++){
        //     System.out.print(list.get(i) +" ");
        // }
        // System.out.println();

        // System.out.println(list.contains(777));

        // list.set(2, 56);
       

        // for(int i=0; i< 5; i++){
        //     System.out.print(list.get(i) +" ");
        // }


        // // MULTI- DIMENSIONAL ARRAYLIST

        // ArrayList<ArrayList<Integer>> que = new ArrayList<>();
        // for (int i = 0; i<3; i++){
        //     que.add(new ArrayList<>());
        // }

        // for(int i= 0; i<3; i++){
        //     for (int j = 0; j<3; j++){
        //         que.get(i).add(sc.nextInt());
        //     }
        // }

        
    }
    static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
