public class evenDigits {
    public static void main(String[] args){
        int[] bucket = {10, 111, 10, -69, 56565, -5454, 41, 29};
        int counter = 0;
        for (int i = 0; i < bucket.length; i++) {
            if(even(bucket[i])){
                counter++;
            }
        }
        System.out.println(counter);
    }
    static boolean even(int num){
        int count = 0;
        if(num<0) num  = num*-1;
        if(num == 0) return false;
        while(num>0){
            count++;
            num /=10;
        }
        return count %2 == 0;
        
    }
}
