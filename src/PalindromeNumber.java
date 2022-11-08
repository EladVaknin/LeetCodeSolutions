public class PalindromeNumber {
    public boolean isPalindrome(int x) {
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
}
