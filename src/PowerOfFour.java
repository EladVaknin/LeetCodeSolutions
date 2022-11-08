public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        boolean falg = true;
        if(n == 0) return false;
        while(n != 1) {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }
        return falg;
    }
}
