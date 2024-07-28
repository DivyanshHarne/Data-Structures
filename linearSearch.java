public class linearSearch {
    static int Lsearch(int[] nums, int target){
        if(nums.length==0){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target) return i;
        }
        return -1;
    }

    static boolean SearchString(String str, char target){
        if(str.length()==0) return false;
        
        for(int i= 0; i<str.length(); i++){
            if (str.charAt(i)== target) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arraya[] = {22,2,44,58,64,-77,9,34,+44,-444,-5,2,-15,5,2,7,77,33,45,67,12,34,25};
        int point = -5;
        System.out.println(Lsearch(arraya, point));
        System.out.println(SearchString("Divyansh", 'y'));
    }
}
