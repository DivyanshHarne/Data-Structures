package Recursion;

public class reverseANumber {
    public static void main(String[] args) {
        int n = 958451031;
        System.out.println(reverse2(n));
    }

    static int reverse2 (int number){
        int digits = (int)(Math.log10(number)) +1;
        return helper(number, digits);
     }
    static int helper (int num, int dig){
        if(num == 0) return 0;

        return (num%10 * (int)(Math.pow(10, dig-1))) + helper(num/10, dig-1);
    }

    static int sum = 0;

    static void reverse1(int number){
        if(number == 0) return;

        sum = sum*10 + number%10;
        reverse1(number/10);
    }
}
