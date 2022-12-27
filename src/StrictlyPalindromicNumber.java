public class StrictlyPalindromicNumber {
    public static boolean isStrictlyPalindromic(int n) {
        return false;
    }


    public static boolean isPalindrome(int x) {
        boolean flag = false;
        if (x==0) return true;
        int temp;
        int sum=0;
        int current=0;
        temp = x;
        while (x>0){
            current =x%10;
            sum=(sum *10) +current;
            x=x/10;
            if (temp == sum){
                flag = true;
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(isStrictlyPalindromic(n));
    }

}
