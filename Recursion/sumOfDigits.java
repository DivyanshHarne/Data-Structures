package Recursion;

public class sumOfDigits {
    public static void main(String args[]){
        int n = 134;
        // System.out.println(1/10);
        System.out.println(sum(n));
    }

    static int sum (int number){
        //Base Condition
        if(number/10 == 0) return number;

        int lastDigit = number%10;
        int remainDigits = number/10;
        return lastDigit + sum(remainDigits);
    }
}
