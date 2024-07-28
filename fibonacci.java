public class fibonacci {
    public static void main(String[] args) {
        fibo(7);
    }
    static void fibo(int n ){
        int a = 0;
        int b = 1;
        int num;

        for(int i= 2; i<n; i++){
            num = a+b;
            a = b;
            b = num;
            System.out.println(num);
        }
    }
}
