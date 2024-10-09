import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.printf("This is string: %s \n", str);
        System.out.println(str.length());
        System.out.println(isPalindrome(str));

    }
    static boolean isPalindrome(String str){
        int s = 0;
        int e = str.length()-1;
        while(s<=e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
