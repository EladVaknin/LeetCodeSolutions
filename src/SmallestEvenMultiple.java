public class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        // lcm  - abs ((n*2)/gcd(n,2))
        if (n ==0 ) {
            return 0;
        }
        int sum = n*2;
        int result = Math.abs((sum/gcd(n,2)));
        return result;

    }

    private int gcd(int n, int i) {
        if (i==0) return (n);
        else return gcd(i, n % i);
    }


}
