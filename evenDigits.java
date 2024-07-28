public class evenDigits {
    public static void main(String[] args){
        int[] bucket = {10, 111, 10, 69, 56565, 554, 41, 29};
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
        while(num>0){
            count++;
            num /=10;
        }
        return count %2 == 0;
        
    }
}
