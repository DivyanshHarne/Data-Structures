package Recursion;

public class digitProduct {
    public static void main(String[] args) {
        int b = 123252250;
        System.out.println(product(b));
    }
    static int product(int number){
        if(number == 0) return 1;

        return (number%10) * product(number/10);
    }
}
