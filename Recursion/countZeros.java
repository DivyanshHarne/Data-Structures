package Recursion;

public class countZeros {
    public static void main(String[] args) {
        int n= 302004;
        System.out.println(counter(n, 0));
    }

    static int counter(int number, int count){
        if(number == 0) return count;
        int rem = number%10;
        if(rem == 0){
            return counter(number/10, count+1);
        }else{
            return counter(number/10, count);
        }
    }
}
